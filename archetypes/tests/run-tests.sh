#!/bin/bash

echo Generating test projects via archetypes...
../scripts/create-fact-model.sh test-fact-model
../scripts/create-classic-decision-service.sh test-classic-decision-service test-fact-model
../scripts/create-decision-service.sh test-decision-service test-fact-model
../scripts/create-stp-orchestration-service.sh test-stp-orchestration-service test-fact-model
../scripts/create-process-service.sh test-process-service test-fact-model

echo Buiding test projects generated from archetypes...

cd test-fact-model
mvn clean install
cd ..

cd test-classic-decision-service
mvn clean install
cd ..

cd test-decision-service
mvn clean install
cd ..

cd test-stp-orchestration-service
mvn clean install
cd ..

cd test-process-service
mvn clean install
cd ..

echo Be sure to remove the compiled test projects from your local Maven repository cache, the files are located in ~/.m2/repository/com/ibm/bamoe/myprojects/**...

