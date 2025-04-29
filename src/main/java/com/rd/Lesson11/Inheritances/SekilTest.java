package com.rd.Lesson11.Inheritances;

public class SekilTest {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen(4,5, 10, 20);

        dikdortgen.alanHesapla();
        dikdortgen.yazdirPozisyon();


        Kare kare = new Kare(10,20,30);

        kare.alanHesapla();
        kare.yazdirPozisyon();
    }
}
