package com.rd.Lesson9;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.marka = "Toyota";
        car1.model = "Corolla";
        car1.yil = 2023;

        car1.calistir("CHR");

        car1.durdur();


       Car2 car3 = new Car2();
       Car2 car4 = new Car2(2024,"megane","renault");
       Car2 car5 = new Car2("BYD");
       Car2 car6 = new Car2("ferrari",2024,"f10");


       car3.getYil();
       car4.setYil(2025);
       car5.setModel("BYD modeli");

    }
}
