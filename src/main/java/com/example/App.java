package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController // Add this annotation to mark the class as a controller
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void init() {
        Logger log = LoggerFactory.getLogger(App.class);
        log.info("Java app started");
    }

    @GetMapping("/status") // Add this annotation to specify the mapping for /status
    public String getStatus() {
        return "OK";
    }
}
