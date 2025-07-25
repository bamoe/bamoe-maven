# ${projectDescription}
This repository contains a `Sharable Fact Model Library` packaged as a standard Java Archive (JAR), to be shared by BAMOE decision/process as well as client applications.

# How To Build 
Once you have configured your local development environment, you need to perform a Maven `build` of the repository.  This repository is built using `mvn clean install` by either the CI/CD pipeline or on a local developer workstation.  If deploying artifacts to an enterprise Maven repository, please use `mvn clean deploy`, which requires configuration of the `distributionManagement` section of your project's parent pom.xml.

# Example Usage
```shell
mvn clean install <deploy>
```