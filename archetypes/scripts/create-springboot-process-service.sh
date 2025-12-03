#!/bin/bash

if [ "$1" == "" ]; then
    echo -e "\nUsage: create-springboot-process-service.sh <project-name> [-DpropertyName=propertyValue -DpropertyName=propertyValue] ..."
    echo -e "  where <project-name> is required and -DpropertyName=propertyValue -DpropertyName=propertyValue are optional].\n"
    exit 1
fi

# Remove the project directory if it exists
if [ -d "$1" ]; then rm -rf $1; fi

# Run the archetype and generate the project structure
mvn archetype:generate -B "-DarchetypeGroupId=com.ibm.bamoe.maven.archetypes" "-DarchetypeArtifactId=process-service-archetype" "-DarchetypeVersion=9.3.0-ibm-0007" \
  "-DbamoeRuntime=springboot" \
  "-DprojectName=$1" \
  "-DartifactId=$1"