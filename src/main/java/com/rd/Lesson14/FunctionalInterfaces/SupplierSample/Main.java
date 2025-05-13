package com.rd.Lesson14.FunctionalInterfaces.SupplierSample;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Supplier ile rastgele bir sayı üretme
        Random random = new Random();
        Supplier<Integer> randomSupplier = random::nextInt;
        System.out.println(randomSupplier.get());
    }
}