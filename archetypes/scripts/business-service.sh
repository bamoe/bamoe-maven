#!/bin/bash

if [ "$1" == "" ]; then
    echo -e "\nUsage: business-service.sh <project-name> <quarkus,springboot> [-DpropertyName=propertyValue -DpropertyName=propertyValue] ..."
    echo -e "  where <project-name> <quarkus,springboot> is required and -DpropertyName=propertyValue -DpropertyName=propertyValue are optional].\n"
    exit 1
fi

if [ "$2" == "" ]; then
    echo -e "\nYou must supply the BAMOE Runtime to use: either quarkus or springboot...\n"
    echo -e "\nUsage: business-service.sh <project-name> <quarkus,springboot> [-DpropertyName=propertyValue -DpropertyName=propertyValue] ..."
    echo -e "  where <project-name> <quarkus,springboot> is required and -DpropertyName=propertyValue -DpropertyName=propertyValue are optional].\n"
    exit 1
fi

# Remove the project directory if it exists
if [ -d "$1" ]; then rm -rf $1; fi

# Run the archetype and generate the project structure
mvn archetype:generate -B "-DarchetypeGroupId=com.ibm.bamoe.maven.archetypes" "-DarchetypeArtifactId=bamoe-business-service-archetype" "-DarchetypeVersion=9.3.1-ibm-0006" \
  "-DprojectName=$1" \
  "-DartifactId=$1" \
  "-DbamoeRuntime=$2",\
  "-DusePersistence=false"