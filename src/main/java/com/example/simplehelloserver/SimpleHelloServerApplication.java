package com.example.simplehelloserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleHelloServerApplication {

    private int counter = 0;

    public static void main(String[] args) {
        SpringApplication.run(SimpleHelloServerApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        counter++;
        return "Hello World: counter = " + counter;
    }

    @GetMapping("/demo")
    public String demo() {
        return "Demo page";
    }

}
