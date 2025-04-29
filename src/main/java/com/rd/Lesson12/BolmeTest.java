package com.rd.Lesson12;

public class BolmeTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            int sonuc = a / b;
        } catch (ArithmeticException ex) {
            throw new ArithmeticException(ex.getMessage());
        }
    }

}
