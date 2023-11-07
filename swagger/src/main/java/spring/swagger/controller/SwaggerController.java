package spring.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class SwaggerController {

    @GetMapping("/hello")
    public String helloSwagger() {
        return "Hello, Swagger";
    }
}
