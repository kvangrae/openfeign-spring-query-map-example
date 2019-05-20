package test.getpostbug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return ok(service.helloWorld());
    }

    @GetMapping(value = "/helloWorld", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> one() {
        return ok("\"hello world!\"");
    }
}
