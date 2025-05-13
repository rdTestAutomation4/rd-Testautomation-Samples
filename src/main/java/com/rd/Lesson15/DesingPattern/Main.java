package com.rd.Lesson15.DesingPattern;

public class Main {
    public static void main(String[] args) {
      Bilgisayar bilgisayar = Bilgisayar.BilgisayarBuilder.aBilgisayar()
                .withMarka("Casper")
                .withIslemci("İntel")
                .withRam(16)
                .withDepolama(500)
                .build();

        System.out.println(bilgisayar);


        Bilgisayar bigisayar3 = Bilgisayar.BilgisayarBuilder.aBilgisayar()
                .withMarka("Dell")
                .withIslemci("Intel")
                .withDepolama(500)
                .withRam(512)
                .build();

        System.out.println(bigisayar3.toString());

/*
        Bilgisayar2 bilgisayar2 = Bilgisayar2.Bilgisayar2Builder.aBilgisayar2()
                .withIslemci("AMD")
                .withDepolama(1000)
                .withRam(32)
                .build();

        System.out.println(bilgisayar2.toString()); */
    }
}
