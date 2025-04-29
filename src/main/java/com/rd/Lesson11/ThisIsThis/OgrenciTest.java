package com.rd.Lesson11.ThisIsThis;

public class OgrenciTest {
    public static void main(String[] args) {

        /*Ogrenci ogrenci = new Ogrenci();

        ogrenci.setIsim("Serkan");
        System.out.println(ogrenci);

        ogrenci.yazdirOgrenci("Ahmet");;*/

        Sayi sayi = new Sayi();

        System.out.println(sayi.getDeger());

        Sayi sayi1 = new Sayi(10);

        System.out.println(sayi1.getDeger());
    }
}
