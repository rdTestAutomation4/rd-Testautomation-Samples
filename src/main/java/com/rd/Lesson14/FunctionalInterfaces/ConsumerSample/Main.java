package com.rd.Lesson14.FunctionalInterfaces.ConsumerSample;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("serkan", "ahmet", "mehmet");

        Consumer<String> printItem = System.out::println;
        list.forEach(printItem);

    }
}

