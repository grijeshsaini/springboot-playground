package com.grijesh.jpa.service;

import com.grijesh.jpa.domain.Customer;

import java.util.List;

/**
 * Created by grijesh on 19/11/15.
 */
public interface CustomerService {

    public void runExample();

    public List<Customer> listAllCustomers();

    public void save(Customer customer);
}
