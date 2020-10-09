#!/usr/bin/env bash

# Copyright (C) 2020, Tim Neumann <neumantm@fius.informatik.uni-stuttgart.de>
#
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License 2.0
# which accompanies this distribution, and is available at
# https://www.eclipse.org/legal/epl-2.0/
#
# SPDX-License-Identifier: EPL-2.0

dir="$(dirname "$(realpath "$0")")"

if [ $# -ne 1 ] ;then
  echo "Need the target directory"
  exit
fi

cp -r -t "$1" "$dir/artifacts.jar" "$dir/content.jar" "$dir/features" "$dir/plugins" "$dir/site.xml"

git clean -fX "$dir"
