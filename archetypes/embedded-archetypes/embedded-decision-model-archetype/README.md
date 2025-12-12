# IBM Business Automation Manager Open Editions (IBM BAMOE) - Embedded Decision Model Archetype
This repository contains a custom [**Maven Archetype**](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) used for creating an embedded decision model project
based on [**IBM Business Automation Manager Open Edition v9**](https://www.ibm.com/docs/en/ibamoe/9.3.x). 

# Using the Archetype
This custom Maven archetype can be run from the developer workstation, build server, or any other environment where a command line tool can be used, assuming that environment has access to the enterprise Maven repository for which the archetype has been installed or deployed. Once installed into Maven, the archetype can be run either via the command line.

## Using the Archetype from the Command Line
Once the archetype has been built and installed into the enterprise artifact repository, navigate to the project folder for which you would like to create the new project, and run the following command (replacing the properties with the appropriate project value):

```shell
mvn archetype:generate -B "-DarchetypeGroupId=com.ibm.bamoe.maven.archetypes" "-DarchetypeArtifactId=bamoe-embedded-decision-model-archetype" "-DarchetypeVersion=9.3.1-ibm-0006" \
  "-DprojectName=$1" \
  "-DartifactId=$1" \
  "-DmodelName=$2" \
  "-DmodelNamespace=$3" \
```
