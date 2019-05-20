package test.getpostbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "test.getpostbug")
public class GetPostBugApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetPostBugApplication.class, args);
    }

}
