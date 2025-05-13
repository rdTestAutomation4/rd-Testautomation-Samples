package com.rd.Lesson14.genericType;

public class Main {

    public static void main(String[] args) {
        Box<Integer, String> intBox = new Box<>();
        intBox.setContent(10);
        intBox.setValue("On");
        System.out.println(intBox.getContent());
        System.out.println(intBox.getValue());
        intBox.yazdir(10, "on");


        Box<String, Boolean> strBox = new Box<>();
        strBox.setContent("Selam");
        strBox.setValue(true);
        System.out.println(strBox.getContent());
        System.out.println(strBox.getValue());
        strBox.yazdir("Deneme", true);


    }
}
