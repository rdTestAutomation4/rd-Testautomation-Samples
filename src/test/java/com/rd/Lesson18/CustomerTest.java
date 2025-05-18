package com.rd.Lesson18;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer = new Customer();

    @Before
    public void before(){

        customer.setFirstname("John");
        customer.setEmail("john@doe.com");
    }

    @Test()
    public void testCustomerName() {
        assertEquals("John", customer.getFirstname());
    }

    @Test
    public void tetCustomerEmail() {
        assertEquals("john@doe.com", customer.getEmail());
    }

    @Test
    public void testToplama(){
        int sonuc = customer.toplama(5,10);
        assertEquals(16, sonuc);
    }

    @After
    public void tearDown(){

    }
}
