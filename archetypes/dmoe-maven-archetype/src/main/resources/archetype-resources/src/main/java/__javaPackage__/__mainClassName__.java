package ${package};

#if (${runtime} == 'quarkus')
// Note: If using the Quarkus runtime, please remove this class from the src/main/java/** package, as it is not necessary for Quarkus applications.
#end
#if (${runtime} == 'spring-boot')
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "org.kie.kogito.dmn.**", "org.kie.kogito.app.**", "http**", "${package}.**" })
public class ${mainClassName} {

    public static void main(String[] args) {
        SpringApplication.run(${mainClassName}.class, args);
    }
}
#end
