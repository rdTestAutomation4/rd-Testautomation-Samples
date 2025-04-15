package com.rd.Lesson8;


import java.util.ArrayList;

public class Arrays1 {
    public static void main(String[] args) {
/*
        int[] numbers = new int[5]; // {0,0,0,0,0}
        numbers[4] = 10;

       System.out.println(numbers[1]);

        int ikinciEleman = numbers[1];
        numbers[1] = 3;

        System.out.println(numbers[1]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Diznin "+ (i+1) +". elemanı: " +numbers[i]);
        }

        System.out.println("ikinci eleman: "+ ikinciEleman);
 */
        String[] meyveler = new String[5];

        meyveler[0] = "Elma";
        meyveler[3] = "Armut";
        meyveler[2] = "Nar";

        for (int i=0; i < meyveler.length; i++ ){
            System.out.println(i+ ". meyve= "+meyveler[i]);
        }

        for(String meyve : meyveler){
            System.out.println(meyve);
        }

    }
}