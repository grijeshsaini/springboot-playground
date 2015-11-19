package com.grijesh.jpa.health;

import com.grijesh.healthcheck.impl.CustomHealthCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * Created by grijesh on 20/11/15.
 */
@Component
public class JpaHealthCheck extends AbstractHealthIndicator {

    @Autowired
    private CustomHealthCheck customHealthCheck;

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up();
        customHealthCheck.doHealthCheck(builder);
    }
}
