package cursospringboot.bruno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class ApplicationStar {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStar.class, args);
    }
}
