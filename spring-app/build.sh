#!/usr/bin/env bash
# set -e

echo "starting spring prometheus...";

mvn clean spring-boot:run;
echo "Maven exit code: $?";
