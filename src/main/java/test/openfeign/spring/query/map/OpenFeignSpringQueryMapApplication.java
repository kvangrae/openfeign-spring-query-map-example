package test.openfeign.spring.query.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "test.openfeign.spring.query.map")
public class OpenFeignSpringQueryMapApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignSpringQueryMapApplication.class, args);
    }

}
