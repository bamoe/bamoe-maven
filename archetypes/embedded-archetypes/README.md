# IBM Business Automation Manager Open Editions (IBM BAMOE) - Embedded Engine Maven Archetypes
This repository contains custom [**Maven Archetypes**](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) for creating embedded engine rules, decision model, and stateless workflow projects based on [**IBM Business Automation Manager Open Edition**](https://www.ibm.com/docs/en/ibamoe/9.3.x), which can be embedded into any Java application.

# Repository Modules
This is a multi-module repository, with the following modules:

- [**Embedded Rules Archetype**](./embedded-rules-archetype) is an archetype that can create an embedded rules (DRL, XLS) project that can be embedded into a Java application. 
- [**Embedded Decision Model Archetype**](./embedded-decision-model-archetype) is an archetype that can create an embedded decision model (DMN) project that can be embedded into a Java application. 
- [**Embedded Stateless Workflow Archetype**](./embedded-stateless-workflow-archetype) is an archetype that can create an embedded stateless (BPMN) workflow project that can be embedded into a Java application. 

> [!IMPORTANT]  
> Do not create a new project in the same working directory as the `bamoe-maven` repository was cloned into.  This will result in an incorrect Maven project file being generated.  Always create a separate folder to hold your BAMOE Maven projects!

# Additional Information (*Appendicies*)
This repository is focused on business automation using [**IBM Business Automation Manager Open Editions**](https://www.ibm.com/docs/en/ibamoe/9.2.x) products, specifically the IBM build of [**Kogito**](https://kogito.kie.org/) known as **IBM Decison Manager Open Edition**.
- [**Apache Maven**](https://maven.apache.org/) is a free and open source software project management and comprehension tool. Based on  the concept of a project object model (POM), Maven can manage a project’s build, reporting and documentation from a central piece of  information. A **getting started guide** is available [here](http://maven.apache.org/guides/getting-started/).

- [**Git**](https://git-scm.com//) is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency. There is a **handbook** available [here](https://guides.github.com/introduction/git-handbook/), as well as various **guides** for learning and working with Git available [here](https://guides.github.com/)
