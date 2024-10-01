package com.rd.Lesson5.HelloWorld;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloWorld {
    public static void main(String[] args) {

        int toplam = toplama(1,3);
        int toplam2 = 1+3;
        System.out.println("Hello World! " + toplam2 +", " + toplam);
    }

    public static int toplama(int sayi1, int sayi2){
        return sayi1 +sayi2;
    }
}
