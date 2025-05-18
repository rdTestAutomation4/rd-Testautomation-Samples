package com.rd.Lesson18;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CustomerTestNG {
    Customer customer = new Customer();
    Customer customer1;
    @BeforeClass
    public void beforeClass(){

        customer1 = Customer.builder()
                .email("x@y.com")
                .firstname("x")
                .lastname("y")
                .build();
    }

    @BeforeMethod()
    public void beforeMethod(){
        customer.setFirstname("Ahmet");
    }

    @Test(groups = "unit")
    public void testCustomerName() {
        assertEquals(customer1.getLastname(), "y");
        assertEquals(customer.getFirstname(), "Ahmet" );
    }

    @Test(groups = "unit")
    public void testCustomerEmail() {
        Customer customer3 = new Customer("John Doe", "johndoe@example.com");

        assertEquals(customer3.getEmail(), "johndoe@example.com");
        assertEquals(customer1.getLastname(), "y");
        assertEquals(customer.getFirstname(), "Ahmet");
    }

    @AfterMethod()
    public void teardown(){

    }
}

