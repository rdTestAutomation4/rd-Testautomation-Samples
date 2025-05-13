package com.rd.Lesson14.annotations;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        RdTestAutomation rdTestAutomation = new RdTestAutomation();

        rdTestAutomation.yazdir();

        Class<?> sinif = rdTestAutomation.getClass();
        Annotation[] ekBilgiler = sinif.getAnnotations();

        for(Annotation bilgi: ekBilgiler) {
            System.out.println(bilgi);
        }
 /*
        BaseClass baseClass = new BaseClass();

        System.out.println(baseClass.cikar(2,5));

        System.out.println(baseClass.topla(2,3));

        Annotations annotations = new Annotations();

        System.out.println(annotations.topla(2,3));

        baseClass.getList();
/*

       Machine machine = new Machine();
       machine.addVersion("test");*/
    }
}
