#!/usr/bin/env bash
# Run the shared conformance vectors (../test-vectors.tsv) against the Kotlin port.
# Uses kotlinc from PATH (GitHub's Ubuntu images carry one); without it, downloads the pinned compiler first.
set -euo pipefail
cd "$(dirname "$0")"
KOTLIN_VERSION=2.1.21
kc=$(command -v kotlinc || true)
if [ -z "$kc" ]; then
  tools="${RUNNER_TEMP:-/tmp}/kotlinc-$KOTLIN_VERSION"
  if [ ! -x "$tools/kotlinc/bin/kotlinc" ]; then
    mkdir -p "$tools"
    curl -fsSL -o "$tools/k.zip" "https://github.com/JetBrains/kotlin/releases/download/v$KOTLIN_VERSION/kotlin-compiler-$KOTLIN_VERSION.zip"
    unzip -q "$tools/k.zip" -d "$tools"
  fi
  kc="$tools/kotlinc/bin/kotlinc"
fi
"$kc" -version 2>&1 | head -1 || true
mkdir -p _build
"$kc" -nowarn CrosslyWebhooks.kt CheckVectors.kt -include-runtime -d _build/vectors.jar
java -jar _build/vectors.jar
