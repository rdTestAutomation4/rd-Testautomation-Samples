package com.rd.Lesson8;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
/*
        List<String> liste = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list2.add("Turuncu");
        list2.add("Eflatun");
        liste.add("Kırmızı");
        liste.add("Mavi");
        System.out.println(liste);
        liste.add(2,"Beyaz");
        liste.add(3,"Sarı");
        System.out.println(liste);
        liste.add("Yeşil");
        liste.set(2,"Mor");
        liste.add(3, "Gri");
        System.out.println(liste);
        liste.addAll(list2);
        Boolean varMi = liste.contains("Gri");
        System.out.println(liste);


        System.out.println(varMi);

        System.out.println(liste.size());

        System.out.println(liste.get(2) +" -  " + liste.get(3));

*/

        LinkedList<String> linkedList =  new LinkedList<>();

        linkedList.add("Armut");
        linkedList.add("Elma");
        linkedList.set(1, "Ayva");

        System.out.println(linkedList);

        System.out.println(linkedList.get(1));


        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Mavi");
        hashSet.add("Kırmızı");

        System.out.println(hashSet);

    }
}
