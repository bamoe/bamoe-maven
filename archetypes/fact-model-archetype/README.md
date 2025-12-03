# IBM Business Automation Manager Open Editions (IBM BAMOE) - Sharable Fact Model Archetype
This repository contains a custom [**Maven Archetype**](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) used for creating reusable fact model _(aka data model)_ for used with rules, decisions, processes, and client appliations.

# Using the Archetype
This custom Maven archetype can be run from the developer workstation, build server, or any other environment where a command line tool can be used, assuming that environment has access to the enterprise Maven repository for which the archetype has been installed or deployed. Once installed into Maven, the archetype can be run either via the command line.

## Using the Archetype from the Command Line
Once the archetype has been built and installed into the enterprise artifact repository, navigate to the project folder for which you would like to create the new project, and run the following command (replacing the properties with the appropriate project value):

```shell
mvn archetype:generate -B "-DarchetypeGroupId=com.ibm.bamoe.maven.archetypes" "-DarchetypeArtifactId=fact-model-archetype" "-DarchetypeVersion=1.0.0" \
  "-DprojectName=$1" \
  "-DartifactId=$1"
```

> [!IMPORTANT]  
> Do not create a new project in the same working directory as the `bamoe-maven` repository was cloned into.  This will result in an incorrect Maven project file being generated.  Always create a separate folder to hold your BAMOE Maven projects!

