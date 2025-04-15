package com.rd.Lesson7;


public class Loop1 {

    public static void main(String[] args) {
/*
        System.out.println(" For döngüsü: ");
        for (int i = 1; i <= 10; i +=2) {

            System.out.println("i = " + i);
        }

        System.out.println(" For-each döngüsü: ");

        int[] sayilar = {1, 2, 3, 4, 5};

        for ( int index=0; index < sayilar.length; index++){
            int sayi = sayilar[index] - 1;
            System.out.println("for döngüsü sayı = " + sayi);
        }


        for (int sayi : sayilar) {
            sayi = sayi - 1;
            System.out.println("for each döngüsü sayı = " + sayi);
        }


        String[] meyveler = {"Elma", "Armut", "Mandlaina"};
        for (String meyve : meyveler){
            System.out.println("Meyvemiz = " + meyve);
        }


        System.out.println(" While döngüsü: ");

        int sayac = 1;
        while (sayac <= 5) {
            sayac++;
            System.out.println("Yenileme:  "+sayac);
        }



        boolean tekMi=true;
        int sayi =  4;

        while(tekMi && sayi>0){
            if (sayi%2==0){
                tekMi = false;
            }

            System.out.println("Sayi: "+ sayi +" Sayi tek mi? " + tekMi);
            sayi+=1;
        }

*/
        System.out.println("Do While döngüsü: ");

        int sayac1 = 0;
        do {
            sayac1=5;
            sayac1++;
            System.out.println("Sonlu yenimeleme: "+ sayac1);

        } while (sayac1 <= 5);

    }
}