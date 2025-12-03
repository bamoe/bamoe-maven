#!/bin/bash

if [ "$1" == "" ]; then
    echo -e "\nUsage: create-embedded-decision-model.sh <project-name> <model-name> <model-namespace [-DpropertyName=propertyValue -DpropertyName=propertyValue] ..."
    echo -e "  where <project-name> <model-name> <model-namespace> are required and -DpropertyName=propertyValue -DpropertyName=propertyValue are optional].\n"
    exit 1
fi

# Remove the project directory if it exists
if [ -d "$1" ]; then rm -rf $1; fi

# Run the archetype and generate the project structure
mvn archetype:generate -B "-DarchetypeGroupId=com.ibm.bamoe.maven.archetypes" "-DarchetypeArtifactId=bamoe-embedded-decision-model-archetype" "-DarchetypeVersion=9.3.0-ibm-0007" \
  "-DprojectName=$1" \
  "-DartifactId=$1" \
  "-DmodelName=$2" \
  "-DmodelNamespace=$3" \
