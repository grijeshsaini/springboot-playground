package com.grijesh.main;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * Created by grijesh on 31/10/15.
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);

    }
}
