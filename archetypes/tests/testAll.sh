#!/bin/bash

echo Generating sample projects via archetypes...
../scripts/fact-model.sh sample-fact-model
../scripts/quarkus-decision.sh sample-quarkus-decision
../scripts/sb-decision.sh sample-sb-decision
../scripts/quarkus-process.sh sample-quarkus-process

echo Buiding sample projects generated from archetypes...

cd sample-fact-model
mvn clean install
cd ..

cd sample-quarkus-decision
mvn clean install
cd ..

cd sample-quarkus-process
mvn clean install
cd ..

cd sample-sb-decision
mvn clean install
cd ..

echo Be sure to remove the compiled test projects from your local Maven repository cache, the files are located in ~/.m2/repository/com/myorg/**...

