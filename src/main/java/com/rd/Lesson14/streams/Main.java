package com.rd.Lesson14.streams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Örnek 1
        /*
        List<Integer> sayilar = Arrays.asList(2, 1, 3, 4, 6, 5, 7, 8, 9, 10);
        sayilar.stream()
                .filter(num -> num % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println); */
        // Örnek 2
        List<String> isimler = Arrays.asList("ahmet", "mehmet", "serkan");
        String bulunan = isimler.stream()
                //.filter(isim -> isim.contains("a")).forEach(System.out::println);
                .filter(isim -> isim.equals("cura")).findFirst().orElse("Bulunamadı");

        if (!bulunan.equals("Bulunamadı"))
            System.out.println("Bulunan: "+ bulunan);
        else System.out.println(bulunan);
    }

}
