package ${package}.rules;

#if (${bamoeRuntime} == 'springboot')
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "${package}.rules.**" })
public class ${applicationClassName} {

    public static void main(String[] args) {
        SpringApplication.run(${applicationClassName}.class, args);
    }
}
#end
