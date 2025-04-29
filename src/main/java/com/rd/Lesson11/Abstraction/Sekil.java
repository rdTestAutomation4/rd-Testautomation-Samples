package com.rd.Lesson11.Abstraction;

public abstract class Sekil {
    abstract void cevreHesapla();
    abstract void alanHesapla();

    public void yazdir(String sekil){
        System.out.println("Bu bir "+ sekil);
    }

}
