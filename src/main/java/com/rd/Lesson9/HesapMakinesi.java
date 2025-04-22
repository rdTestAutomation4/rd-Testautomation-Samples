package com.rd.Lesson9;

public class HesapMakinesi {

    public int topla(int sayi1, int sayi2) {
        int sonuc = sayi1 + sayi2;
        return sonuc;
    }

    public double topla(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    public int topla(int sayi1, int sayi2, int sayi3) {
        int sonuc = sayi1 + sayi2 + sayi3;
        return sonuc;
    }

    public double cikar( double sayi1, double sayi2) {
        double sonuc = sayi1 -sayi2;
        return  sonuc;
    }

    public int cikar( int sayi1, int sayi2) {
        int sonuc = sayi1 -sayi2;
        return  sonuc;
    }

    public static void main(String[] args) {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();

        int toplamaSonucu = hesapMakinesi.topla(4,8);
        double cikarmaSonucu = hesapMakinesi.cikar(10.4,4.4);


        int toplamSonucu1 = hesapMakinesi.topla(6,7,8);


        System.out.println("Toplama sonucu: "+ toplamaSonucu);
        System.out.println("Çıkarma sonucu: "+ cikarmaSonucu);
        System.out.println("Toplama1 sonucu: "+ toplamSonucu1);


        System.out.println("Toplama sonucu: " + hesapMakinesi.topla(5.3, 2.1));
        System.out.println("Toplama sonucu: " + hesapMakinesi.topla(5, 6, 7));
    }
}
