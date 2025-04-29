package com.rd.Lesson11.ThisIsThis;

public class SayiTest {
    public static void main(String[] args) {
        Sayi sayi = new Sayi();

        System.out.println(sayi.getDeger());

        Sayi sayi1 = new Sayi(10);

        System.out.println(sayi1.getDeger());
    }
}
