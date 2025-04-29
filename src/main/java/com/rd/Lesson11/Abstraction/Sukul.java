package com.rd.Lesson11.Abstraction;

public abstract class Sukul {
    abstract String cikti();

    public void yazdir(String sukul){
        System.out.println("Bu bir şukuldur." + cikti());
    }
}
