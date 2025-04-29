package com.rd.Lesson11.ThisIsThis;

public class Sayi {
    private int deger;

    public Sayi(int i) {
        this.deger =i;
    }

    public int getDeger() {
        return deger;
    }

    public Sayi(){
        this(100);
    }
}
