package com.rd.Lesson11;

public class VeriSaklayici {
    private int gizliSayi;
    private int pi = 3;

    public int getGizliSayi() {
            return gizliSayi;
    }

    public void setGizliSayi(int gizliSayi) {
        this.gizliSayi = gizliSayi;
    }

    private int topla(int sayi){
        return (sayi + gizliSayi) * pi ;
    }

    public void Hesaplama(int x, int y) {
        setGizliSayi(y);
        System.out.println("Toplam: "+ topla(x));
    }

}
