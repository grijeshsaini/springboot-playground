package com.grijesh.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by grijesh on 31/10/15.
 */

@EnableAutoConfiguration
@ComponentScan("com.grijesh.controllers")
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);

    }
}
