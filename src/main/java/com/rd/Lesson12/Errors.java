package com.rd.Lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Errors {
    public static void main(String[] args) throws IOException {
        String dosyaYolu = "src/main/java/com/rd/Lesson12/dosya.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaYolu));
        String satir;

        while ((satir = bufferedReader.readLine()) != null) {
            System.out.println(satir);
        }
    }
}
