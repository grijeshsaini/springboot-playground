package com.grijesh.metrics;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Component;

/**
 * This class is one way to add custom metrics using cross cutting AOP.
 *
 * Created by grijesh.
 */

@Aspect
@Component
public class CustomMetrics {

    private CounterService counterService;

    @Autowired
    public CustomMetrics(CounterService counterService) {
        this.counterService = counterService;
    }

    @AfterReturning(pointcut = "execution(* com.grijesh.jpa.service.CustomerServiceImpl.save(*))")
    public void afterSave(){
        counterService.increment("counter.save_customer");
    }
}
