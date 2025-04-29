package com.rd.Lesson10;

public class EnumDonusturme {
    public static void main(String[] args) {

        String donusturulenGun = HaftaGunleri.PAZARTESI.name();
        System.out.println(HaftaGunleri.CARSAMBA.compareTo(HaftaGunleri.CARSAMBA));
        int gunValue = HaftaGunleri.PAZARTESI.getGunNo();

        System.out.println("Dönüşütürlen Gün: "+donusturulenGun.toLowerCase() +" - Haftanın "+gunValue+". günü");

        String gun = "SALI";
        HaftaGunleri guneDonustur = HaftaGunleri.valueOf(gun);
        System.out.println("Haftanın günü: "+ guneDonustur);
    }
}
