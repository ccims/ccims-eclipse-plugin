#!/usr/bin/env

SCHEMA="schema.json"

dir="$(dirname "$(realpath "$0")")"

function fail {
  echo "$1"
  exit $2
}

if ! which ruby > /dev/null 2>&1 ;then
  fail "Need ruby" 11
fi

if [ $# -ne 0 ] ;then
  fail "Not expecting any argument"
fi

originalSupportSrc="$dir/graphql_java_gen/support/src/main/java"
srcSupportFolder="$dir/src-support"
rm -rf "$srcSupportFolder"
cp -r -T "$originalSupportSrc" "$srcSupportFolder"

srcGenFolder="$dir/src-gen"
pkgFolder="$srcGenFolder/de/unistuttgart/iste/rss/ccims/eclipseplugin/apibindings"
rm -rf "$srcGenFolder"
mkdir --parents "$pkgFolder"

ruby internalGenerate.rb "$SCHEMA" "$pkgFolder"
