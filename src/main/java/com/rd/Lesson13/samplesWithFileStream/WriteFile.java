package com.rd.Lesson13.samplesWithFileStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("src/main/java/com/rd/Lesson13/samplesWithFileStream/aaas.txt");

            String veri = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt";

            byte[] bytes =  veri.getBytes();

            fos.write(bytes);
            System.out.println("Dosyaya yazıldı!");

            fos.close();
        } catch (IOException e) {
            System.out.println("Dosya yazılamadı! Hata: "+ e.getMessage() + ", Detay:  " + Arrays.toString(e.getStackTrace()));
        }
    }
}
