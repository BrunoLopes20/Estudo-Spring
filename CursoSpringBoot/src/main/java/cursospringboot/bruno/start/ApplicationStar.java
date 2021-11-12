package cursospringboot.bruno.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "cursospringboot.bruno")
public class ApplicationStar {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStar.class, args);
    }
}
