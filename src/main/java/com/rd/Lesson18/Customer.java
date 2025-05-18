package com.rd.Lesson18;


import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;

    public Customer(String firstname){
        this.firstname = firstname;
    }

    public Customer(String firstname, String email){
        this.firstname = firstname;
        this.email = email;
    }

    public Integer toplama(int a, int b){
        return a+b+1;
    }
}
