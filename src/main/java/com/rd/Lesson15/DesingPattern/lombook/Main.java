package com.rd.Lesson15.DesingPattern.lombook;

public class Main {
    public static void main(String[] args) {
  /*      Bilgisayar bilgisayar = Bilgisayar.builder()
                .marka("Casper")
                .islemci("İntel")
                .ram(16)
                .depolama(500)
                .build();


        System.out.println(bilgisayar); */

        Bilgisayar3 bilgisayar3 = Bilgisayar3.builder()
                .islemci("AMD")
                .ram(16)
                .depolama(1000)
                .build();

        System.out.println(bilgisayar3.toString());


        Bilgisayar bilgisayar = Bilgisayar.builder()
                .marka("Apple")
                .depolama(500)
                .islemci("M3")
                .ram(512)
                .build();

        System.out.println(bilgisayar);
    }



}
