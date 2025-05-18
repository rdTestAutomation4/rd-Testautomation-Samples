package com.rd.Lesson17.JDBI;


import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementException;

import java.util.Optional;

public class JDBIExample {

    public static void main(String[] args) {
        // PostgreSQL bağlantı bilgileri
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String kullaniciAdi = "postgres";
        String sifre = "password";
        String name = "John Doe";

        // JDBI nesnesinin oluşturulması ve bağlantının alınması
        Jdbi jdbi = Jdbi.create(url, kullaniciAdi, sifre);
        try (Handle handle = jdbi.open()) {
            // SQL sorgusunun hazırlanması ve çalıştırılması
            handle.execute("CREATE TABLE IF NOT EXISTS users (id SERIAL PRIMARY KEY, name VARCHAR(100))");
            handle.execute("INSERT INTO users (name) VALUES (?)", name);

            // Sorgu sonucunun alınması
            String result = handle.createQuery("SELECT * FROM users WHERE id = :id and name = :username")
                    .bind("id", 1)
                    .bind("username","serkan")
                    .mapTo(String.class)
                    .one();

            System.out.println("Result: " + result);

            Optional<Long> update = handle.createUpdate("UPDATE users SET name=:name WHERE id = :id")
                            .bind("id",0)
                            .bind("name","serkan")
                            .executeAndReturnGeneratedKeys().mapTo(long.class).findFirst();

            System.out.println("Update: " + update);

        } catch (StatementException e) {
            e.printStackTrace();
        }
    }
}

