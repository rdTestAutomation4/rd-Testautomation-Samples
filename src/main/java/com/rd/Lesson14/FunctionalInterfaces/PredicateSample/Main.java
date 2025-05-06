package com.rd.Lesson14.FunctionalInterfaces.PredicateSample;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Predicate ile sayıların pozitif olup olmadığını kontrol etme
        Predicate<Integer> pozitifMi = (sayi) -> sayi > 0;

        int[] sayilar = {-1, 0, 1, 2, 3};
        for (int sayi : sayilar) {
            if (pozitifMi.test(sayi)) {
                System.out.println(sayi + " pozitiftir");
            }
        }
    }
}