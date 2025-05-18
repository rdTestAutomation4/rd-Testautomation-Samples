package com.rd.Lesson18;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CustomerTestsWithDataProvider {

    @Test(groups = "unit", dataProvider = "credentials")
    public void testCustomer(String firstname, String lastName , String response){
        Customer customer = new Customer(firstname, lastName);

        assertEquals(customer.getFirstname(), response );
        assertEquals(customer.getLastname(), null );

    }

    @DataProvider(name = "credentials")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"johndoe", "lastname", "johndoe"},
                {"janedoe", "lastname", "janedoe"},
                {"janedoe", "lastname", "janedoe"},
                {"janedoe", "lastname", "janedoe"},
                {"janedoe", "lastname", "janedoe"},
                {"janedoe", "lastname", "janedoe"},
                {"janedoe", "lastname", "janedoe"},
                {"janedoe", "lastname", "janedoe"}
        };
    }

}
