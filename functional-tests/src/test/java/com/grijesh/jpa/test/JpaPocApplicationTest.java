package com.grijesh.jpa.test;

import com.grijesh.jpa.Application;
import com.grijesh.jpa.domain.Customer;
import com.grijesh.jpa.domain.CustomerRepository;
import com.jayway.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Arrays;

import static com.jayway.restassured.RestAssured.when;

/**
 * Created by grijesh on 20/11/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class JpaPocApplicationTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Value("${local.server.port}")
    int port;

    @Before
    public void setup(){

        Customer customer1 = new Customer("Grijesh","Saini");
        Customer customer2 = new Customer("Grijesh1","Saini1");
        Customer customer3 = new Customer("Grijesh2","Saini2");

        customerRepository.deleteAll();
        customerRepository.save(Arrays.asList(customer1,customer2,customer3));

        RestAssured.port = port;
    }

    @Test
    public void getAllCustomers(){
        when().
                get("/jpa/customers").
        then().
                statusCode(HttpStatus.SC_OK).
                body("firstName", Matchers.hasItems("Grijesh", "Grijesh1", "Grijesh2"));
    }

}
