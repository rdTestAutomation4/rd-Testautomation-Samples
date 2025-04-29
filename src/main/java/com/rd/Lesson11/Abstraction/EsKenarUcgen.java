package com.rd.Lesson11.Abstraction;

public class EsKenarUcgen extends Sekil {
    private int taban;
    private int yukseklik;

    EsKenarUcgen(int taban, int yukseklik) {
        this.taban = taban;
        this.yukseklik = yukseklik;
    }

    @Override
    void cevreHesapla() {
        System.out.println("Üçgenin çevresi = "+ 3 * this.taban);
    }

    @Override
    void alanHesapla() {
        System.out.println("Üçgenin alanı = "+ ((this.yukseklik * this.taban) / 2) );
    }
}
