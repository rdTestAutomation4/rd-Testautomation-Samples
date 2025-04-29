package com.rd.Lesson11.Interfaces;

public interface Veritabani {

    String DATABASE_NAME= "db_veritabani";
    int MYSQL_PORT = 3306;
    int POSTGRESQL_PORT = 5432;

    void baglan();
    void sorguYap();
    void baglantiKapat();

}
