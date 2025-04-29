package com.rd.Lesson11.Interfaces;

public class VeriTabanıTest {
    public static void main(String[] args) {
        MySQLVeritabani mySQLVeritabani = new MySQLVeritabani();
        mySQLVeritabani.baglan();
        mySQLVeritabani.sorguYap();
        mySQLVeritabani.baglantiKapat();

        PostgreSQLVeritabani postgreSQLVeritabani = new PostgreSQLVeritabani();
        postgreSQLVeritabani.baglan();
        postgreSQLVeritabani.sorguYap();
        postgreSQLVeritabani.baglantiKapat();
    }
}
