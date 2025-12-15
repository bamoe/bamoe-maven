#if (${bamoeRuntime} == 'springboot')
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "${package}.**", "org.kie.**", "org.drools.**", "org.jbpm.**"})
public class ${applicationClassName} {

    public static void main(String[] args) {
        SpringApplication.run(${applicationClassName}.class, args);
    }
}
#end
