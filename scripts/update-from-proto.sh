#!/bin/bash
# Regenerate the SDK from the output of the "Generate SDKs" workflow in https://github.com/1080network/proto.
#
# Usage: scripts/update-from-proto.sh <version> <generated-dir>
#   <version>        release tag the code was generated from: vX.Y.Z or vX.Y.Z-preN
#   <generated-dir>  the generated output (the artifact directory containing java/ and kotlin/)
#
# Download the generated code for a release with:
#   gh run download <run-id> -R 1080network/proto -n generated-sdks-<version>
set -euo pipefail

VERSION=${1:?usage: $0 <version> <generated-dir>}
GEN=${2:?usage: $0 <version> <generated-dir>}
ROOT=$(cd "$(dirname "$0")/.." && pwd)

if [[ ! "$VERSION" =~ ^v[0-9]+\.[0-9]+\.[0-9]+(-pre[0-9]+)?$ ]]; then
    echo "version '$VERSION' must look like v1.2.3 or v1.2.3-pre0" >&2
    exit 1
fi
if [[ ! -d "$GEN/java/io/mica/issuer" || ! -d "$GEN/kotlin/io/mica/issuer" ]]; then
    echo "'$GEN' does not look like generated output (expected java/io/mica/issuer and kotlin/io/mica/issuer)" >&2
    exit 1
fi

echo "Laying out $VERSION from $GEN"
# Generated code only: hand-written code under src/main and src/test is left alone.
# common: shared messages (io/mica/common, io/mica/member, io/micashared); each role: its own io/mica/<role>.
layout() { # <module> <relative package dir>...
    local module=$1; shift
    rm -rf "$ROOT/$module/src/generated"
    for lang in java kotlin; do
        for pkg in "$@"; do
            mkdir -p "$ROOT/$module/src/generated/$lang/$(dirname "$pkg")"
            cp -r "$GEN/$lang/$pkg" "$ROOT/$module/src/generated/$lang/$(dirname "$pkg")/"
        done
    done
}
layout common io/mica/common io/mica/member io/micashared
layout issuer io/mica/issuer
layout acceptor io/mica/acceptor

# The version is the proto release tag; Maven drops the leading "v" (see buildSrc)
sed -i.bak "s/^globalVersion=.*/globalVersion=$VERSION/" "$ROOT/gradle.properties" && rm "$ROOT/gradle.properties.bak"

(cd "$ROOT" && ./gradlew build)
echo "Done. Publish with ./gradlew publish after the pull request is merged and tagged $VERSION."
