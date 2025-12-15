import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

// The path where the project got generated
Path projectPath = Paths.get(request.outputDirectory, request.artifactId);

// the properties available to the archetype
Properties properties = request.properties;

// Grab the relevant archetype properties
String javaPackageName = properties.get("javaPackage");
String javaPackagePath = javaPackageName.replace(".", "/");

System.out.println("Running post project generation script...");
System.out.println("--> Java Package Path: " + javaPackagePath);

// Rename the .gitignore file since Maven has a hard time copying this during project generation
Path source = projectPath.resolve("gitignore");
System.out.println("--> Renaming file: " + source + " to " + ".gitignore");
Files.move(source, source.resolveSibling(".gitignore"));
