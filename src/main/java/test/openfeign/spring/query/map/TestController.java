package test.openfeign.spring.query.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.format;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/")
public class TestController {
    private final HelloWorldService service;

    @Autowired
    public TestController(HelloWorldService service) {
        this.service = service;
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> get() {
        return ok(service.sayHelloToUser(new User("jimmy", "jimmy@example.org", 25)));
    }

    @GetMapping(value = "/hello", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> hello(@ModelAttribute User user) {
        return ok(format("\"hello %s (email: %s, age: %d)!\"", user.getName(), user.getEmail(), user.getAge()));
    }
}
