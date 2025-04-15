package com.rd.Lesson7;


import java.util.ArrayList;
import java.util.List;

public class Loop4 {

    public static void main(String[] args) {
        int sayi=3;

        List<Integer> dizi = new ArrayList<>();

        for(int i=0; i<=100; i++){
            dizi.add(i);
        }

        System.out.println(arama(dizi, sayi));

    }

    public static String arama(List<Integer> dizi, int aranan) {
        for (int eleman : dizi) {
            System.out.println("Eleman= " + eleman);

            if (eleman == aranan) {

                return "Eleman bulundu"+ eleman;
            }
        }
        return "Eleman bulunamadı!";
    }
}