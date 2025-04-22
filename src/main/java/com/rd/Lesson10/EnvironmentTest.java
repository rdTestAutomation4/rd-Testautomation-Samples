package com.rd.Lesson10;

public class EnvironmentTest {
    public static void main(String[] args) {
        String ortamIsmi = Environment.DEV.name();
        System.out.println(ortamIsmi);

        for (Environment ortam : Environment.values()){
            System.out.println("Ortam: "+ ortam.getOrtam(ortam)+ ", Url: "+ ortam.getUrl(ortam));
        }
    }
}
