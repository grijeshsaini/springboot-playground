package com.grijesh.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by grijesh on 31/10/15.
 */

@SpringBootApplication
@ComponentScan("com.grijesh")
public class Application extends SpringBootServletInitializer {
    public static void main(String... args) {
        SpringApplication.run(Application.class, args);

    }
}
