package com.rd.Lesson9;

public class StaticOzellikler {

    public static final double PI = 3.14;

    public static int counter = 0;

    public  int instanceCounter = 0;

    public StaticOzellikler() {
        counter++;
        instanceCounter++;
    }


    public static void main(String[] args) {

        System.out.println("PI sayısı: "+ StaticOzellikler.PI);

        System.out.println("Sayaç: " + StaticOzellikler.counter);

        StaticOzellikler nesne1 = new StaticOzellikler();
        System.out.println("Sayaç: "+ StaticOzellikler.counter);
        System.out.println("InstanceSayac: " + nesne1.instanceCounter);


        StaticOzellikler nesne2 = new StaticOzellikler();
        System.out.println("Sayaç: "+ nesne2.counter);
        System.out.println("InstanceSayac: "+ nesne2.instanceCounter);


        StaticOzellikler nesne3 = new StaticOzellikler();
        System.out.println("Sayaç: "+ nesne3.counter);
        System.out.println("InstanceSayac: "+ nesne3.instanceCounter);


    }
}
