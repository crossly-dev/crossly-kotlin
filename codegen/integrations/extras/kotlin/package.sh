#!/usr/bin/env bash
# Build the release artifacts of both Kotlin clients into dist/ (run from the repository root, after
# check-kotlin.sh): per client the jar, -sources.jar, -javadoc.jar and the pom, named as Maven Central lays them out.
set -euo pipefail
mkdir -p dist
for client in seller buyer; do
  (cd "$client" && ./gradlew --no-daemon -q jar sourcesJar javadocJar generatePomFileForMavenPublication)
  art=$(sed -n "s/^rootProject.name = '\(.*\)'/\1/p" "$client/settings.gradle")
  ver=$(sed -n "s/^version = '\(.*\)'/\1/p" "$client/build.gradle")
  libs="$client/build/libs"
  cp "$libs/$art-$ver.jar" "$libs/$art-$ver-sources.jar" "$libs/$art-$ver-javadoc.jar" dist/
  cp "$client/build/publications/maven/pom-default.xml" "dist/$art-$ver.pom"
done
ls -l dist
