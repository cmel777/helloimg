package com.example.helloimg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/img")
public class HelloControllerApplication {

    Logger logger = Logger.getLogger(HelloimgApplication.class.getName());

    @Autowired
    private Environment env;

    @GetMapping("/hello")
    public String helloImg(){
        logger.info("Serving request from " + env.getProperty("HOSTNAME"));
        System.out.println("Serving request from " + env.getProperty("HOSTNAME"));
        return "Success " + env.getProperty("HOSTNAME");
    }
}
