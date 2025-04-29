package com.rd.Lesson11.Abstraction;

public class Daire extends Sekil{
    public final static int PI =3;
    private int r;

    public Daire(int r){
        this.r = r;
    }

    @Override
    void cevreHesapla() {
        System.out.println("Daire'nin çevresi: "+ 2 * PI * this.r);
    }

    @Override
    void alanHesapla() {
        System.out.println("Daire'nin alanı:" + (PI*r^2) );
    }
}
