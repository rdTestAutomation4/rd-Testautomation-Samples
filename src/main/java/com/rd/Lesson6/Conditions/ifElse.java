package com.rd.Lesson6.Conditions;

public class ifElse {
    public static void main(String[] args) {
        int sayi = 10;

        // Basit bir "if" koşulu
        if (sayi > 5) {
            System.out.println("Sayı 5'ten büyük.");
        }

        // "if-else" ifadesi
        if (sayi > 20) {
            System.out.println("Sayı 20'den büyük.");
        } else {
            System.out.println("Sayı 20'den küçük veya eşit.");
        }


        if (sayi > 15) {
            System.out.println("Sayı 15'ten büyük.");
        } else if (sayi > 10) {
            System.out.println("Sayı 10'dan büyük.");
        } else {
            System.out.println("Sayı 10'dan küçük veya eşit.");
        }

        // Mantıksal operatörlerle koşullar
        int yas = 18;
        boolean ehliyetVar = false;

        if (yas >= 18 && ehliyetVar) {
            System.out.println("Ehliyet alabilirsiniz.");
        } else {
            System.out.println("Ehliyet alamazsınız.");
        }

        int a = 5;
        boolean sonuc = (a<10) && (++a >5);
        System.out.println(sonuc);
    }
}

