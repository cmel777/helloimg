package com.example.helloimg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class HelloimgApplication {

    Logger logger = Logger.getLogger(HelloimgApplication.class.getName());


    public static void main(String[] args) {
        SpringApplication.run(HelloimgApplication.class, args);
    }
}
