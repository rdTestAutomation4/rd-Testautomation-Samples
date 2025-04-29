package com.rd.Lesson11.Interfaces;

public class MySQLVeritabani implements Veritabani {



    @Override
    public void baglan() {
        System.out.println("mySql'e bağlandı, port= " + MYSQL_PORT);
    }

    @Override
    public void sorguYap() {

    }

    @Override
    public void baglantiKapat() {

    }
}
