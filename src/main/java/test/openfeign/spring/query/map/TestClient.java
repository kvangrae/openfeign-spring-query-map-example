package test.openfeign.spring.query.map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient("test")
public interface TestClient extends HelloWorldService {

    @Override
    @GetMapping(value = "/hello", produces = APPLICATION_JSON_VALUE)
    String helloWorld(@SpringQueryMap User user);
}
