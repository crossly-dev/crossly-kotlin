#!/usr/bin/env node
/**
 * Finish one generated Kotlin client so it builds, publishes to Maven Central and carries the vendored extras.
 *
 *   node codegen/integrations/extras/kotlin/finish.mjs <seller|buyer dir>
 *
 * Run by codegen/ci/check-kotlin.sh before every build. Idempotent. It does what the generator cannot be told to
 * (the shared generate-sdks.mjs passes only the package options):
 *
 *   1. build.gradle: the 5.4.0 template is Gradle 6.8.3 + Kotlin 1.5.10, which runs on no JDK newer than 15 and
 *      cannot read the metadata of current Ktor or coroutines. It is rewritten for Gradle 8.11 + Kotlin 2.1, keeping
 *      the generator's dependency list (as `api`, since its types are in the client's signatures), with the
 *      net.crossly coordinates, sources/javadoc jars, an Implementation-Version manifest entry (the User-Agent
 *      reads it), Central's POM metadata, and Ktor + coroutines as compileOnly (the webhook plugin and the Flow
 *      pager compile against them; your app brings its own).
 *   2. settings.gradle names the artifact; the wrapper points at Gradle 8.11.1; gradle.properties sizes the heap
 *      for ~4,000 model classes compiled in process.
 *   3. Vendored files (codegen/repo.json, copied again here so CI on an older committed tree checks the current
 *      extras) land in src/main/kotlin/net/crossly/, because assemble.mjs only copies into an existing directory;
 *      each one whose `package` names a sub-package is moved to the matching directory.
 */
import { cpSync, existsSync, mkdirSync, readdirSync, readFileSync, renameSync, writeFileSync } from 'node:fs';
import { basename, dirname, join, resolve, sep } from 'node:path';
import { fileURLToPath } from 'node:url';

export const GRADLE = '8.11.1';
export const KOTLIN = '2.1.21';
export const KTOR = '3.1.3';
export const COROUTINES = '1.10.2';

const dir = resolve(process.argv[2] ?? '');
const gradlePath = join(dir, 'build.gradle');
if (!existsSync(gradlePath)) {
  console.error(`finish: no build.gradle in ${dir}`);
  process.exit(2);
}
const side = basename(dir) === 'buyer' ? 'buyer' : 'seller';
const artifactId = side === 'buyer' ? 'crossly-kotlin-buyer' : 'crossly-kotlin';
const REPO = 'https://github.com/crossly-dev/crossly-kotlin';
const MARK = '// Finished by codegen/integrations/extras/kotlin/finish.mjs';

// ── 3. vendored files ───────────────────────────────────────────────────────────────────────────────────────
const CODEGEN = resolve(dirname(fileURLToPath(import.meta.url)), '..', '..', '..');
const ROOT = resolve(CODEGEN, '..');
const repoJson = join(CODEGEN, 'repo.json');
for (const v of existsSync(repoJson) ? JSON.parse(readFileSync(repoJson, 'utf8')).vendor ?? [] : []) {
  if (resolve(ROOT, v.to).startsWith(dir + sep)) cpSync(join(CODEGEN, 'integrations', v.from), resolve(ROOT, v.to));
}
const ktRoot = join(dir, 'src', 'main', 'kotlin');
const landing = join(ktRoot, 'net', 'crossly');
let moved = 0;
for (const name of existsSync(landing) ? readdirSync(landing) : []) {
  if (!name.endsWith('.kt')) continue;
  const file = join(landing, name);
  const pkg = readFileSync(file, 'utf8').match(/^package\s+([\w.]+)\s*$/m)?.[1];
  if (!pkg || pkg === 'net.crossly') continue;
  const target = join(ktRoot, ...pkg.split('.'));
  mkdirSync(target, { recursive: true });
  renameSync(file, join(target, name));
  moved += 1;
}

// ── 1. build.gradle ─────────────────────────────────────────────────────────────────────────────────────────
const generated = readFileSync(gradlePath, 'utf8');
let state = 'already finished';
if (!generated.startsWith(MARK)) {
  const version = generated.match(/^version\s+'([^']+)'/m)?.[1];
  const deps = [...generated.matchAll(/^\s*implementation\s+"([^"]+)"\s*$/gm)].map((m) => m[1]);
  if (!version || !deps.length) {
    console.error('finish: build.gradle has no `version` or no `implementation` lines: the template changed, update finish.mjs');
    process.exit(1);
  }
  const what = side === 'buyer' ? 'buyer API (shopping: cart, orders, wishlists, offers)' : 'seller API (listings, crossposting, orders, analytics)';
  writeFileSync(
    gradlePath,
    `${MARK} from the generator's build.gradle
// (Gradle 6.8.3 + Kotlin 1.5.10 there); the dependency list is the generator's. Edits here are overwritten.

buildscript {
    ext.kotlin_version = '${KOTLIN}'
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    }
}

apply plugin: 'kotlin'
apply plugin: 'java-library'
apply plugin: 'maven-publish'

group = 'net.crossly'
version = '${version}'

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    withSourcesJar()
    withJavadocJar()
}

tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile).configureEach {
    compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
    // The generated models alone produce thousands of deprecation warnings.
    compilerOptions.suppressWarnings.set(true)
}

jar {
    manifest {
        attributes('Implementation-Title': '${artifactId}', 'Implementation-Version': project.version)
    }
}

// A plain POM and no Gradle module metadata: dist/ holds exactly what Maven Central receives.
tasks.withType(GenerateModuleMetadata).configureEach {
    enabled = false
}

dependencies {
${deps.map((d) => `    api "${d}"`).join('\n')}
    // Webhook plugin (net.crossly.webhooks.ktor) and the Flow pager: compiled against, never brought in.
    compileOnly "io.ktor:ktor-server-core:${KTOR}"
    compileOnly "org.jetbrains.kotlinx:kotlinx-coroutines-core:${COROUTINES}"
}

publishing {
    publications {
        maven(MavenPublication) {
            artifactId = '${artifactId}'
            from components.java
            pom {
                name = 'Crossly Kotlin SDK (${side})'
                description = 'Official Kotlin client for the Crossly ${what}, generated from the public OpenAPI spec, with retries, auto-pagination and the webhook verifier.'
                url = '${REPO}'
                licenses {
                    license {
                        name = 'MIT License'
                        url = 'https://opensource.org/licenses/MIT'
                        distribution = 'repo'
                    }
                }
                developers {
                    developer {
                        id = 'crossly'
                        name = 'Crossly'
                        organization = 'Crossly'
                        organizationUrl = 'https://crossly.net'
                    }
                }
                scm {
                    url = '${REPO}'
                    connection = 'scm:git:${REPO}.git'
                    developerConnection = 'scm:git:${REPO}.git'
                }
            }
        }
    }
}
`,
  );
  state = 'rewritten';
}

// ── 2. settings, wrapper, heap ──────────────────────────────────────────────────────────────────────────────
writeFileSync(join(dir, 'settings.gradle'), `rootProject.name = '${artifactId}'\n`);
const wrapper = join(dir, 'gradle', 'wrapper', 'gradle-wrapper.properties');
if (existsSync(wrapper)) {
  writeFileSync(
    wrapper,
    readFileSync(wrapper, 'utf8').replace(
      /^distributionUrl=.*$/m,
      `distributionUrl=https\\://services.gradle.org/distributions/gradle-${GRADLE}-bin.zip`,
    ),
  );
}
writeFileSync(
  join(dir, 'gradle.properties'),
  [
    'org.gradle.jvmargs=-Xmx6g -XX:MaxMetaspaceSize=1g -Dfile.encoding=UTF-8',
    'kotlin.compiler.execution.strategy=in-process',
    'kotlin.incremental=false',
    '',
  ].join('\n'),
);
// The kotlin template writes no .gitignore, and release.yml commits seller/ and buyer/ after building them.
writeFileSync(join(dir, '.gitignore'), ['build/', '.gradle/', '.kotlin/', ''].join('\n'));
// An anyOf parameter (e.g. listListings' `tag`: string | string[]) is emitted as `AnyOfstringarray`, a type the
// 5.4.0 template never generates. Every such undefined AnyOf* name becomes kotlin.String: one value, which every such
// parameter accepts.
const sources = [];
const walk = (d) => {
  for (const e of existsSync(d) ? readdirSync(d, { withFileTypes: true }) : []) {
    const p = join(d, e.name);
    if (e.isDirectory()) walk(p);
    else if (e.name.endsWith('.kt')) sources.push(p);
  }
};
walk(ktRoot);
const definedAnyOf = new Set();
for (const f of sources) {
  for (const m of readFileSync(f, 'utf8').matchAll(/\b(?:class|enum|interface|object)\s+(AnyOf\w+)/g)) definedAnyOf.add(m[1]);
}
let anyOf = 0;
for (const f of sources) {
  const text = readFileSync(f, 'utf8');
  const next = text
    .replace(/^import\s+[\w.]+\.(AnyOf\w+);?[ \t]*\r?\n/gm, (line, name) => (definedAnyOf.has(name) ? line : ''))
    .replace(/\bAnyOf\w+\b/g, (name) => (definedAnyOf.has(name) ? name : (anyOf++, 'kotlin.String')));
  if (next !== text) writeFileSync(f, next);
}
console.log(`finish ${side}: ${artifactId}, build.gradle ${state}, ${moved} vendored file(s) moved, ${anyOf} AnyOf type(s) -> kotlin.String`);
