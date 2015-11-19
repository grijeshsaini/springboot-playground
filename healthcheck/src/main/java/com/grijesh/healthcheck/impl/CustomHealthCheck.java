package com.grijesh.healthcheck.impl;

import com.grijesh.healthcheck.config.CustomHealthCheckService;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import static com.grijesh.healthcheck.config.HealthStatus.CONNECTED;

/**
 * Created by grijesh on 20/11/15.
 */
@Component
public class CustomHealthCheck implements CustomHealthCheckService {

    @Override
    public void doHealthCheck(Health.Builder builder) {
        try {
            //Do Some Check
            builder.withDetail("Health Status", CONNECTED);
        }catch (Exception e){
            setHealthStatusOnException("JPA-HEALTH",builder,e);
        }
    }
}
