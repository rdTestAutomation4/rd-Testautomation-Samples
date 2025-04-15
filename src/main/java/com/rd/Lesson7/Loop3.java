package com.rd.Lesson7;

public class Loop3 {

    public static void main(String[] args) {
        double bolunen = 10;
        double bolum;

        for (double bolen = 0; bolen <= 5; bolen++) {

            if (bolen == 0) {
                System.out.println("Bölen 0 olamaz: " + bolen);
                continue;
            }
            bolum = bolunen / bolen;

            System.out.println("Bölüm: " + bolum);
        }
    }
}