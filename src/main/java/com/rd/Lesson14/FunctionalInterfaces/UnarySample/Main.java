package com.rd.Lesson14.FunctionalInterfaces.UnarySample;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        // UnaryOperator ile bir sayıyı iki katına çıkarma
        UnaryOperator<Integer> doubleValue = num -> num * 2;

        System.out.println(doubleValue.apply(4));  // 8
        System.out.println(doubleValue.apply(10)); // 20


        BinaryOperator<Integer> add = Integer::sum;

        System.out.println(add.apply(5,3));
    }
}
