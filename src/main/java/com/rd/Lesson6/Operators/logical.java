package com.rd.Lesson6.Operators;

public class logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean sonuc1 = (a && b); // false
        System.out.println(sonuc1);
        boolean sonuc2 = (a || b); // true
        System.out.println(sonuc2);
        boolean sonuc3 = !(a && b);       // false
        System.out.println(sonuc3);
    }
}
