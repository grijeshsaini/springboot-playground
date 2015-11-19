package com.grijesh.jpa.controller;

import com.grijesh.jpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by grijesh on 19/11/15.
 */

@RestController
public class JpaTestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public void runApplication() {
        customerService.runExample();
    }

}
