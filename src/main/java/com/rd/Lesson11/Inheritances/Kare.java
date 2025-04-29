package com.rd.Lesson11.Inheritances;

public class Kare extends Sekil {
    private int kenar;

    public Kare(int kenar,  int x, int y){
        super(x, y);
        this.kenar = kenar;
        yazdirPozisyon();
    }
    public Kare(int kenar) {
        super(15,20);
        this.kenar = kenar;
    }

    public Kare() {
        super(10,20);
    }

    public void alanHesapla() {
        System.out.println("Karenin alanı: "+ (kenar*kenar));
        yazdirPozisyon();
    }
}
