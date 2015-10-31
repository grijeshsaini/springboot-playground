package com.grijesh.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by grijesh on 31/10/15.
 */

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!!";
    }

}