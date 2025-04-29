package com.rd.Lesson12;

public class DebugExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        try {
            // Dizideki elemanların toplamını hesaplayalım
            for (int i = 0; i <= numbers.length; i++) { // Mantıksal hata: <= yerine < olmalı
                sum += numbers[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Dizi ineks hatası "+ ex.getMessage());
            System.out.println("-----------");
            throw new ArithmeticException("dizi indeksi 5 olamaz");
        }
        finally {
            System.out.println("Dizideki elemanların toplamı: " + sum);
        }


    }
}
