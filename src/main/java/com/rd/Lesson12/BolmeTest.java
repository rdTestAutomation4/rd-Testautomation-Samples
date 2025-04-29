package com.rd.Lesson12;

public class BolmeTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            int sonuc = a / b;
        } catch (BolmeException ex){
            throw new BolmeException("0'a bölme yapılamaz");
        }
    }
}
