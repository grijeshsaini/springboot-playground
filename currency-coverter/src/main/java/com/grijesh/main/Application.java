package com.grijesh.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.*;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Created by grijesh on 31/10/15.
 */

@Import(value = {
        HealthIndicatorAutoConfiguration.class,
        EndpointAutoConfiguration.class,
        EndpointWebMvcAutoConfiguration.class,
        SecurityAutoConfiguration.class,
        ServerPropertiesAutoConfiguration.class,
        EmbeddedServletContainerAutoConfiguration.class,
        HttpMessageConvertersAutoConfiguration.class,
        JacksonAutoConfiguration.class,
        WebMvcAutoConfiguration.class,
        AuditAutoConfiguration.class,
        EndpointMBeanExportAutoConfiguration.class,
        MultipartAutoConfiguration.class,
        TraceWebFilterAutoConfiguration.class,
        ManagementSecurityAutoConfiguration.class,
        ErrorMvcAutoConfiguration.class,
        DispatcherServletAutoConfiguration.class,
        TraceRepositoryAutoConfiguration.class,
        AopAutoConfiguration.class,
        ManagementServerPropertiesAutoConfiguration.class,
        PropertyPlaceholderAutoConfiguration.class,
        PublicMetricsAutoConfiguration.class,
        MetricRepositoryAutoConfiguration.class,
        JerseyAutoConfiguration.class
})
//@EnableAutoConfiguration
@ComponentScan("com.grijesh.controllers")
public class Application extends SpringBootServletInitializer{
    public static void main(String ...args){
        SpringApplication.run(Application.class,args);

    }
}
