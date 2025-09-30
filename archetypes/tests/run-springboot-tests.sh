#!/bin/bash

echo Generating test projects via archetypes...
#../../scripts/create-fact-model.sh test-fact-model
../../scripts/create-springboot-classic-decision-service.sh test-springboot-classic-decision-service
../../scripts/create-springboot-decision-service.sh test-springboot-decision-service ""
#../../scripts/create-springboot-stp-service.sh test-springboot-stp-service
#../../scripts/create-springboot-process-service.sh test-springboot-process-service

echo Buiding test projects generated from archetypes...

#cd test-fact-model
#mvn clean install
#cd ..

cd test-springboot-classic-decision-service
mvn clean install
cd ..

cd test-springboot-decision-service
mvn clean install
cd ..

#cd test-springboot-stp-service
#mvn clean install
#cd ..

#cd test-springboot-process-service
#mvn clean install
#cd ..

echo Be sure to remove the compiled test projects from your local Maven repository cache, the files are located in ~/.m2/repository/com/ibm/edu/bamoe/**...

