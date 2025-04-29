package com.rd.Lesson11.Abstraction;

public class SekilTest {
    public static void main(String[] args) {
       /* Dikdortgen dikdortgen = new Dikdortgen(4,5);

        dikdortgen.cevreHesapla();
        dikdortgen.alanHesapla();
        dikdortgen.yazdir("Dikdörtgen");

        Kare kare = new Kare(6);

        kare.cevreHesapla();
        kare.alanHesapla();
        kare.yazdir("Kare");

        EsKenarUcgen esKenarUcgen = new EsKenarUcgen(6,4);

        esKenarUcgen.cevreHesapla();
        esKenarUcgen.alanHesapla();
        esKenarUcgen.yazdir("Eş kenar üçgen");


        KareSukul kareSukul = new KareSukul();

        kareSukul.cikti();
        kareSukul.yazdir("Test");*/

        int piSayisi = Daire.PI;
        System.out.println(piSayisi);

        Daire daire = new Daire(5);

        daire.alanHesapla();
        daire.cevreHesapla();
        daire.yazdir("Daire");

    }
}
