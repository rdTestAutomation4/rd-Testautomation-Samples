package com.rd.Lesson11.Interfaces;

public class VeriTabanıTest {
    public static void main(String[] args) {
        MySQLVeritabani mySQLVeritabani = new MySQLVeritabani();
        mySQLVeritabani.baglan();

        PostgreSQLVeritabani postgreSQLVeritabani = new PostgreSQLVeritabani();
        postgreSQLVeritabani.baglan();
    }
}
