package com.rd.Lesson17.JDBI;


import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementException;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JDBIExample {

    public static void main(String[] args) {
        // PostgreSQL bağlantı bilgileri
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String kullaniciAdi = "root";
        String sifre = "123456";
        String name = "cura";

        // JDBI nesnesinin oluşturulması ve bağlantının alınması
        Jdbi jdbi = Jdbi.create(url, kullaniciAdi, sifre);
        try (Handle handle = jdbi.open()) {
            // SQL sorgusunun hazırlanması ve çalıştırılması
            handle.execute("CREATE TABLE IF NOT EXISTS users (id SERIAL PRIMARY KEY, name VARCHAR(100))");
            handle.execute("INSERT INTO users (name) VALUES (?)", name);

            // Sorgu sonucunun alınması
            List<Map<String, Object>> results = handle.createQuery("SELECT * FROM users")
                    .mapToMap()
                    .list();

            results.forEach(System.out::println);


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

