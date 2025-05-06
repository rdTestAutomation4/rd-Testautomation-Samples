package com.rd.Lesson14.annotationsWithRetention;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        @Ogrenci(id = 1, adi = "Adı")
        RdTestAutomation rdTestAutomation = new RdTestAutomation();

        Class<?> sinif = rdTestAutomation.getClass();
        Annotation[] ekBilgiler = sinif.getAnnotations();

        for(Annotation bilgi: ekBilgiler) {
            System.out.println(bilgi);
        }
    }
}
