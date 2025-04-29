package com.rd.Lesson10;

public class EnumSinifYapisi {
    public static void main(String[] args) {
        HaftaGunleri bugun = HaftaGunleri.PERSEMBE;

        System.out.println("Bugün : " + bugun);
        System.out.println("Bugün : "+ bugun.name());
        System.out.println("Gün numarası: " + bugun.getGunNo());
        System.out.println("Günün durumu: " + bugun.isHaftaIci());
        System.out.println("Hafta Sonu mu? " + bugun.isHaftaSonu());

        HaftaGunleri secilenGun = HaftaGunleri.PAZAR;

        System.out.println("Seçilen Gün : " + secilenGun);
        System.out.println("Ordinal: "+ secilenGun.ordinal());
        System.out.println("Seçilen Gün numarası: " + secilenGun.getGunNo());
        System.out.println("Seçilen Günün durumu: " + secilenGun.isHaftaIci());
        System.out.println("Seçilen Gün Hafta Sonu mu? " + secilenGun.isHaftaSonu());

    }
}
