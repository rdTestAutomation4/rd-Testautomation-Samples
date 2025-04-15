package com.rd.Lesson8;


import java.util.Random;

public class MultiDimension {

    public static void main(String[] args) {

        int[][] matris = new int[3][3];
        matris[0][0] = 1;
        matris[0][1] = 3;
        int matris_degiskeni = matris[2][1];
        System.out.println("Satır Sayısı: "+ matris.length);
        System.out.println("1. satırdaki sütun sayısı: "+ matris[0].length);

        Random random = new Random();
        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
            matris[satir][sutun] = random.nextInt(100);
            }
        }

        for (int satir = 0; satir < matris.length; satir++) {
            System.out.print("|");
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
                System.out.print( "   " + matris[satir][sutun] + "   " );
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println( "Matris değişkeni: "+ matris_degiskeni);
    }
}
