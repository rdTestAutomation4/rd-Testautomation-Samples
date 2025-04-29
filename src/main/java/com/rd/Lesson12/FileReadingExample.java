package com.rd.Lesson12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {

    public static void main(String[] args) {
        String dosyaYolu = "src/main/java/com/rd/Errors/dosya.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaYolu))){
            String satir;

            while ((satir = bufferedReader.readLine()) != null) {
                System.out.println(satir);
            }

        } catch (FileNotFoundException ex) {
            int hataKodu = 100;
            System.out.println("Dosya bulunamadı: " + "Hata kodu: "+ hataKodu);
        } catch (IOException ex) {
            int hataKodu = 200;
            System.out.println("Dosya okuma hatası: " + ex.getMessage() + "Hata Kodu: "+ hataKodu );
            } catch (Exception ex) {
            int hataKodu = 10;
            System.out.println("Dosya bulunamadı: " + ex.getMessage() + "Hata kodu: "+ hataKodu);
        }
        finally {

            System.out.println("Dosya okuma işlemi tamamlandı.");
        }
    }
}
