import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

// The path where the project got generated
Path projectPath = Paths.get(request.outputDirectory, request.artifactId);

// the properties available to the archetype
Properties properties = request.properties;

// Grab the relevant archetype properties
String runtime = properties.get("bamoeRuntime");
String applicationClassName = properties.get("applicationClassName");
String javaPackageName = properties.get("javaPackage");
String javaPackagePath = javaPackageName.replace(".", "/");

System.out.println("Running post project generation script...");
System.out.println("--> BAMOE Runtime: " + runtime);
System.out.println("--> Application Class Name: " + applicationClassName);
System.out.println("--> Java Path: " + javaPackagePath);

// Rename the .gitignore file since Maven has a hard time copying this during project generation
Path source = projectPath.resolve("gitignore");
System.out.println("--> Renaming file: " + source + " to " + ".gitignore");
Files.move(source, source.resolveSibling(".gitignore"));

// Remove the generated files based on the selected runtime
if (runtime == "quarkus") {

    Path applicationClassFile = projectPath.resolve("src/main/java/" + javaPackagePath + "/" + applicationClassName + ".java");
    System.out.println("--> Deleting generated file: " + applicationClassFile);
    Files.deleteIfExists(applicationClassFile);

    Path corsConfigClassFile  = projectPath.resolve("src/main/java/" + javaPackagePath + "/" + "CorsConfig.java");
    System.out.println("--> Deleting generated file: " + corsConfigClassFile);
    Files.deleteIfExists(corsConfigClassFile);

    Path appDevPropertiesFile = projectPath.resolve("src/main/resources/application-dev.properties");
    System.out.println("--> Deleting generated file: " + appDevPropertiesFile);
    Files.deleteIfExists(appDevPropertiesFile);
} 