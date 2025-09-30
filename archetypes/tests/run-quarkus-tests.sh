#!/bin/bash

echo Generating test projects via archetypes...
#../../scripts/create-fact-model.sh test-fact-model
../../scripts/create-quarkus-classic-decision-service.sh test-quarkus-classic-decision-service 
../../scripts/create-quarkus-decision-service.sh test-quarkus-decision-service 
#../../scripts/create-quarkus-stp-service.sh test-quarkus-stp-service 
#../../scripts/create-quarkus-process-service.sh test-quarkus-process-service 

echo Buiding test projects generated from archetypes...

#cd test-fact-model
#mvn clean install
#cd ..

cd test-quarkus-classic-decision-service
mvn clean install
cd ..

cd test-quarkus-decision-service
mvn clean install
cd ..

#cd test-quarkus-stp-service
#mvn clean install
#cd ..

#cd test-quarkus-process-service
#mvn clean install
#cd ..

echo Be sure to remove the compiled test projects from your local Maven repository cache, the files are located in ~/.m2/repository/com/ibm/edu/bamoe/**...

