package com.rd.Lesson6.Operators;

public class incrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        x++; // x artık 6
        System.out.println(x);
        x--; // x artık 5
        System.out.println(x);

        System.out.println(++x + " - "+ y++);
        System.out.println(y);
        System.out.println(--x);

    }
}
