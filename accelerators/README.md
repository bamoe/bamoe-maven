# IBM Business Automation Manager Open Editions (IBM BAMOE) - Maven Accelerators
This repository contains custom [**Maven Accelerators**](https://www.ibm.com/docs/en/ibamoe/9.3.x?topic=started-initial-business-service-project-setup) for creating decision and process services based on [**IBM Business Automation Manager Open Edition**](https://www.ibm.com/docs/en/ibamoe/9.3.x).

## Overview
Accelerators are Git repositories that contain a Maven skeleton of an application and that are used to convert a working directory with your .dmn and .bpmn files into a fully functional application that can be built and deployed. In addition they can be used to store configurations that are common to all new Business Service projects within an organization, making them available in BAMOE Canvas for all users in your organization.

## Configuration
Your custom Accelerator must be a public Git repository. After creating it, you need to write a specific JSON configuration that is used in the `KIE_SANDBOX_ACCELERATORS` environment variable for BAMOE Canvas:

```json
{
    "name": "Your Accelerator name",
    "iconUrl": "https://link.to/your/logo/image",
    "gitRepositoryUrl": "https://github.com/...",
    "gitRepositoryGitRef": "branchName",
    "dmnDestinationFolder": "path/to/place/dmn/files",
    "bpmnDestinationFolder": "path/to/place/bpmn/files",
    "otherFilesDestinationFolder": "path/to/place/other/files",
    "scesimDestinationFolder": "path/to/place/scesim/files"
}
```

- **name**: This is how the Accelerator is known inside BAMOE Canvas.
- **iconUrl**: An optional parameter to add an image/logo along with your Accelerator name.
- **gitRepositoryUrl**: This is where your Accelerator is hosted. Must be an URL that can be used with Git clone.
- **gitRepositoryGitRef**: Specifies where in your repository the Accelerator is located. Could be a branch, commit, tag, anything that can be used with Git checkout.
- **dmnDestinationFolder**: Specifies where your DMN and PMML files will be moved after applying the Accelerator (relative to the project root).
- **bpmnDestinationFolder**: Specifies where your BPMN files will be moved after applying the Accelerator (relative to the project root).
- **otherFilesDestinationFolder**: Specifies where other files will be moved after applying the Accelerator (relative to the project root).
- **scesimDestinationFolder**: Specifies where Scesim files will be moved after applying the Accelerator (relative to the project root).

The `KIE_SANDBOX_ACCELERATORS` environment variable, which accepts an array of Accelerator configurations in the format described, by default, comes pre-configured with, which can be overwritten to add your own custom Accelerators by replacing the default ones, or appending to them:

```json
[
    {
      "name": "Quarkus (DMN)",
      "iconUrl": "images/quarkus-logo.png",
      "gitRepositoryUrl": "https://github.com/IBM/bamoe-canvas-quarkus-accelerator",
      "gitRepositoryGitRef": "9.3.1-ibm-0006-quarkus-dmn",
      "dmnDestinationFolder": "src/main/resources/dmn",
      "bpmnDestinationFolder": "src/main/resources/bpmn",
      "otherFilesDestinationFolder": "src/main/resources/others",
      "scesimDestinationFolder": "src/test/resources/scesim",
    },

    {
      "name": "Quarkus (Full)",
      "iconUrl": "images/quarkus-logo.png",
      "gitRepositoryUrl": "https://github.com/IBM/bamoe-canvas-quarkus-accelerator",
      "gitRepositoryGitRef": "9.3.1-ibm-0006-quarkus-full",
      "dmnDestinationFolder": "src/main/resources/dmn",
      "bpmnDestinationFolder": "src/main/resources/bpmn",
      "otherFilesDestinationFolder": "src/main/resources/others",
      "scesimDestinationFolder": "src/test/resources/scesim",
    },

    {
      "name": "Spring Boot (DMN)",
      "iconUrl": "images/springboot-logo.png",
      "gitRepositoryUrl": "https://github.com/IBM/bamoe-canvas-quarkus-accelerator",
      "gitRepositoryGitRef": "9.3.1-ibm-0006-spring-boot-dmn",
      "dmnDestinationFolder": "src/main/resources/dmn",
      "bpmnDestinationFolder": "src/main/resources/bpmn",
      "otherFilesDestinationFolder": "src/main/resources/others",
      "scesimDestinationFolder": "src/test/resources/scesim",
    },

    {
      "name": "Spring Boot (Full)",
      "iconUrl": "images/springboot-logo.png",
      "gitRepositoryUrl": "https://github.com/IBM/bamoe-canvas-quarkus-accelerator",
      "gitRepositoryGitRef": "9.3.1-ibm-0006-spring-boot-full",
      "dmnDestinationFolder": "src/main/resources/dmn",
      "bpmnDestinationFolder": "src/main/resources/bpmn",
      "otherFilesDestinationFolder": "src/main/resources/others",
      "scesimDestinationFolder": "src/test/resources/scesim",
    }
]
```

