#!/bin/bash

echo Generating sample projects via archetypes...
../scripts/quarkus-process.sh sample-quarkus-process

echo Buiding sample projects generated from archetypes...

cd sample-quarkus-process
mvn clean install
cd ..

echo Be sure to remove the compiled test projects from your local Maven repository cache, the files are located in ~/.m2/repository/com/myorg/**...

