package com.rd.Lesson5.Classes;

public class Car {
    String mark;
    String model;
    String color;
    int speed;

    void run() {
        System.out.println(mark + " running.");
    }

    void stop(){
        System.out.println(mark + " stopped." );
    }

    void increaseSpeed(int increment){
        speed += increment;
        System.out.println(mark+ "'s speed is increment: " + increment);
    }
}
