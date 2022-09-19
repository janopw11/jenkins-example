package com.example.jenkinsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsExampleApplication.class, args);
    }
    @GetMapping
    public String get () {
        return "Eluwina byku";
    }

}
