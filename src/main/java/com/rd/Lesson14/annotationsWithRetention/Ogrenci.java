package com.rd.Lesson14.annotationsWithRetention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface Ogrenci {
    int id();
    String adi();
    String soyadi() default "Cura";
}
