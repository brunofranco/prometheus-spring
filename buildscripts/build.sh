#!/usr/bin/env bash
# set -e

# Needed for maven
export PATH=$M2:$PATH

echo "starting spring prometheus...";

mvn clean spring-boot:run;
echo "Maven exit code: $?";
