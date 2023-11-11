package spring.swagger.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

    @GetMapping("/hello")
    public String helloSwagger() {
        return "Hello, Swagger";
    }

}
