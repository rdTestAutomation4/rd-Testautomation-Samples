package com.rd.Lesson8;

import java.util.HashMap;

public class HashMapOzelSinif {
    public static void main(String[] args) {

        HashMap<Integer, Ogrenci> ogrenciMap =  new HashMap<>();

        ogrenciMap.put(1, new Ogrenci("Ali", 20));
        ogrenciMap.put(2, new Ogrenci("Ayşe", 19));
        ogrenciMap.put(3, new Ogrenci("Ahmet", 27));


        Ogrenci ali = ogrenciMap.get(1);

        System.out.println("1 numralı öğrencimizin adı: "+ ali.ad + " yaşı: "+ ali.yas);

        System.out.println("-------");

        System.out.println(String.valueOf(ogrenciMap.values()));

        System.out.println("-------");

        System.out.println(ogrenciMap.keySet());
        System.out.println("----");
        System.out.println(ogrenciMap.entrySet());

        for (int numara : ogrenciMap.keySet()){
            Ogrenci ogr = ogrenciMap.get(numara);
            System.out.println(numara +" -> " +ogr.ad + ", " + ogr.yas + " yaşında!");
        }

    }
}