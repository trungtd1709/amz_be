package trungtd1709.amz_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class AmzBeApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(AmzBeApplication.class, args);
    }
}
