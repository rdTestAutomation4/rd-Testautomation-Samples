package com.rd.Lesson11.Interfaces.multiInheritance;

public class Rabbit implements Walkable, Swimmable{
    @Override
    public void swim() {
        System.out.println("Rabbit isn't swimming.");
    }

    @Override
    public void walk() {
        System.out.println("Rabbit is walking.");
    }
}
