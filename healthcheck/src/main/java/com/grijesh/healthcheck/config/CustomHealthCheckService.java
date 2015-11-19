package com.grijesh.healthcheck.config;

import org.springframework.boot.actuate.health.Health;

import static com.grijesh.healthcheck.config.HealthStatus.DOWN;

/**
 * Created by grijesh on 20/11/15.
 */
public interface CustomHealthCheckService {
    public void doHealthCheck(Health.Builder builder);

    default void setHealthStatusOnException(String key, Health.Builder builder, Exception e){
        builder.withDetail(key, DOWN);
        builder.withDetail(key + "_Error", e.getClass().getName() + ": " + e.getMessage());
        builder.down();
    }
}
