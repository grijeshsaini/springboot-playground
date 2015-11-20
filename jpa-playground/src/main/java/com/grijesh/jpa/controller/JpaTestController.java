package com.grijesh.jpa.controller;

import com.grijesh.jpa.domain.Customer;
import com.grijesh.jpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by grijesh on 19/11/15.
 */

@RestController
@RequestMapping("/jpa")
public class JpaTestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public void runApplication() {
        customerService.runExample();
    }

    @RequestMapping(value = "/customers",method = RequestMethod.GET)
    public List<Customer> allCustomers(){
       return customerService.listAllCustomers();
    }

    @RequestMapping(value = "/addCustomer/{firstName}/{secondName}",method = RequestMethod.GET)
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Customer> addCustomer(@PathVariable("firstName") String firstName, @PathVariable("secondName") String secondName){
       Customer customer = new Customer(firstName,secondName);
        customerService.save(customer);
        return new ResponseEntity<>(customer,HttpStatus.CREATED);
    }

}
