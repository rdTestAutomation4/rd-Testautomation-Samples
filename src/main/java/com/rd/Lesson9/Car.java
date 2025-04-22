package com.rd.Lesson9;

public class Car {
    public String marka;
    public String model;
    public int yil;

    void calistir(String model) {
        System.out.println("Markası: "+ this.marka + ", modeli: "+ model +" olan araç çalıştırıldı");
    }

    void durdur() {
        System.out.println("Markası: "+ this.marka + ", modeli: "+ this.model +" olan araç durdu");
    }
}
