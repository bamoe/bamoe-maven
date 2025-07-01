#!/bin/bash

echo Generating sample projects via archetypes...
../scripts/legacy-decision.sh sample-legacy-rules-kjar
../scripts/legacy-process.sh sample-legacy-process-kjar

echo Buiding sample projects generated from archetypes...

cd sample-legacy-rules-kjar
mvn clean install
cd ..

cd sample-legacy-process-kjar
mvn clean install
cd ..

echo Be sure to remove the compiled test projects from your local Maven repository cache, the files are located in ~/.m2/repository/com/myorg/**...

