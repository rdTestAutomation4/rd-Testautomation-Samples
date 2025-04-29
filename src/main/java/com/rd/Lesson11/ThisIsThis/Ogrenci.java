package com.rd.Lesson11.ThisIsThis;

public class Ogrenci {
    private String isim;

    public void setIsim(String isim) {
        this.isim = isim; // Alan ile parametreyi ayırır.
    }

    public void yazdirOgrenci(String isim){
        System.out.println("Öğrenci: "+ this.isim);
        System.out.println("Yeni Öğrenci: "+ isim);
        this.isim= isim;
        System.out.println("Değiştirilen öğrencinin yeni isimi: "+ this.isim);
    }
}
