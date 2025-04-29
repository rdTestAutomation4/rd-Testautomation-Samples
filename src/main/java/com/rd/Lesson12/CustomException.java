package com.rd.Lesson12;

public class CustomException {
    public static void main(String[] args) {
        try {
            int bolme = 10 / 0;

        } catch (ArithmeticException ex) {
            throw new BolmeException("Bölme işleminde 0'a bölünemez", 400);
        }
    }
}
