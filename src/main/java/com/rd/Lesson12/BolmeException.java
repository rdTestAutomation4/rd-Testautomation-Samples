package com.rd.Lesson12;


public class BolmeException extends ArithmeticException {

    public BolmeException(String errorMessage, int hataKodu) {
        super(errorMessage);
        System.out.println("Kod:"+ hataKodu);
    }
}
