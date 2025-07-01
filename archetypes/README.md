# IBM Business Automation Manager Open Editions (BAMOE) - Maven Archetypes Asset

This repository contains custom [**Maven Archetypes**](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) for creating decision and process services based on [**IBM Business Automation Manager Open Edition**](https://www.ibm.com/docs/en/ibamoe/9.2.x) including legacy v8 as well as the latest cloud-native release of v9 (powered by Kogito).

## Overview
In short, Archetype is a Maven project template generation toolkit. An archetype is defined as an original pattern or model from which all other things of the same kind are made. The name fits as we are trying to provide a system that provides a consistent means of generating Maven projects. The archetype will help authors create Maven project templates for users, and provides users with the means to generate parameterized versions of those project templates.

## Building the Project
In order to build the archetypes, you must run the following command `mvn clean install`, which will build all the archetypes and store themin the enterprise artifact repository as well as the local .m2 cache. 

### Using the Archetype from the Command Line via Scripts
Once the archetype has been built and installed into the enterprise artifact repository, navigate to the project folder for which you would like to create the new project, and run one of the following scripts, which are located in the `scripts` folder of this repository:

- **fact-model.sh <projectName>** - Generates a reusable fact-model project.
- **decision.sh <projectName> <runtime>** - Generates a v9 decision (DMOE) project, must specify the runtime _(quarkus, spring-boot)_.
- **quarkus-decision.sh <projectName>** - Generates a v9 Quarkus-based decision (DMOE) project.
- **sb-decision.sh <projectName>** - Generates a v9 SpringBoot-based decision (DMOE) project.
- **process.sh <projectName> <runtime>** - Generates a v9 process (PAMOE) project, must specify the runtime _(quarkus only at this time, as of 9.2.0 release of BAMOE)_.
- **quarkus-process.sh <projectName>** - Generates a v9 Quarkus-based process (PAMOE) project.
- **legacy-decision.sh <projectName>** - Generates a v8 (legacy) decisions KJAR project.
- **legacy-process.sh <projectName>** - Generates a v8 (legacy) process KJAR project.

> [!IMPORTANT]  
> Do not create a new project in the same working directory as the `bamoe-maven` repository was cloned into.  This will result in an incorrect Maven project file being generated.  Always create a separate folder to hold your BAMOE Maven projects!

> [!TIP]
> Using **Quarkus** is highly recommended over **Spring Boot**.  It is important to remember that you are not going to be writing Quarkus or Spring Boot code necessarily, you will simply be using the Quarkus or Spring Boot based runtime and supporting extensions/tools.  There is better support using Quarkus than Spring Boot, including the ability to generate Kubernetes container images directly from your Maven build process (CI/CD).  Furthermore, if deploying to Red Hat OpenShift, you can take advantage of the Red Hat build of Quarkus, and thus get enterprise support for Quarkus vs community support for Spring Boot.

## Repository Modules
This is a multi-module repository, with the following modules:

- [**Fact Model Maven Archetype**](./fact-model-maven-archetype) is an archetype that can create a reusable fact model project. 
- [**IBM Decision Manager Open Edition (DMOE) Maven Archetype**](./dmoe-maven-archetype) is an archetype that can create a DMOE (v9) decision service project. 
- [**IBM Process Automation Manager Open Edition (PAMOE) Maven Archetype**](./pamoe-maven-archetype) is an archetype that can create a PAMOE (v9) process service project. 
- [**IBM Decision Manager Open Edition (DMOE) Legacy (KJAR) Maven Archetype**](./dmoe-legacy-maven-archetype) is an archetype that can create a legacy DMOE (v8) decision service KJAR project. 
- [**IBM Process Automation Manager Open Edition (PAMOE) Legacy (KJAR) Maven Archetype**](./pamoe-legacy-maven-archetype) is an archetype that can create a legacy (v8) PAMOE process service KJAR project.

