#!/usr/bin/env bash

dir="$(dirname "$(realpath "$0")")"

if [ $# -ne 1 ] ;then
  echo "Need the target directory"
  exit
fi

cp -r -t "$1" "$dir/artifacts.jar" "$dir/content.jar" "$dir/features" "$dir/plugins" "$dir/site.xml"

git clean -fX "$dir"
