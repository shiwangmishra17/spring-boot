package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
    /*public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }*/

}
