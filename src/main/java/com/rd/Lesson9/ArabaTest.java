package com.rd.Lesson9;

public class ArabaTest {

    public static void main(String[] args) {
        Araba araba1 = new Araba();

        araba1.setModel("Renault");
        araba1.setYil(2023);


        System.out.println("1. Araba modeli: "+ araba1.getModel());
        System.out.println("1. Araba yili: "+ araba1.getYil());

        System.out.println("---------------------------");

        Araba araba2 = new Araba("Toyota",2022);

        System.out.println("2. Araba modeli: "+ araba2.getModel());
        System.out.println("2. Araba yili: "+ araba2.getYil());


        System.out.println("---------------------------");

        Araba2 araba3 = new Araba2();

        System.out.println("3. Arabanın marka " + araba3.getMarka());
        System.out.println("3. Arabanın modeli " + araba3.getModel());
        System.out.println("3. Arabanın yıl " + araba3.getYil());
        System.out.println("3. Araba otomatik mi? " + araba3.isOtomatik());

        System.out.println("---------------------------");

        Araba2 araba4 = new Araba2(true, 2024, "MG4", "MG");

        System.out.println("4. Arabanın marka " + araba4.getMarka());
        System.out.println("4. Arabanın modeli " + araba4.getModel());
        System.out.println("4. Arabanın yıl " + araba4.getYil());
        System.out.println("4. Araba otomatik mi? " + araba4.isOtomatik());

    }
}
