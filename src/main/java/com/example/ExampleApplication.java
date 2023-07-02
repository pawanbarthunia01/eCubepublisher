package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExampleApplication {

    @GetMapping("/welcome")
    public String welcomeMessage(){
        return "Welcome docker container app...";
    }
    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

}
