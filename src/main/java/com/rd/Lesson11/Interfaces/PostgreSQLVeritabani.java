package com.rd.Lesson11.Interfaces;

public class PostgreSQLVeritabani implements Veritabani {


    @Override
    public void baglan() {
        System.out.println("PostgreSQL'e bağlandı, port= " + POSTGRESQL_PORT);

    }

    @Override
    public void sorguYap() {

    }

    @Override
    public void baglantiKapat() {

    }
}
