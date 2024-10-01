package com.rd.Lesson5.Classes;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.mark = "Toyota";
        car1.model = "CHR";
        car1.color = "Black";

        car2.mark = "Honda";
        car2.model = "Civic";
        car2.color = "Blue";

        car1.run();
        car1.increaseSpeed(100);
        car1.stop();

        car2.run();
        car2.increaseSpeed(20);
        car2.increaseSpeed(120);
        car2.stop();

    }
}
