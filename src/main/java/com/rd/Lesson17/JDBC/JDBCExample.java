package com.rd.Lesson17.JDBC;

import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String kullaniciAdi = "root";
        String sifre = "123456";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Veritabanına bağlantı oluşturulması
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            // Sorgu hazırlama
            String sqlSorgusu = "SELECT * FROM users";
            preparedStatement = connection.prepareStatement(sqlSorgusu);
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2,"serkan");// Sorgu için parametre ataması

            // Sorgunun çalıştırılması ve sonucun alınması
            resultSet = preparedStatement.executeQuery();

            // Sonuçların işlenmesi
            while (resultSet.next()) {
                // Her bir sonuç satırının işlenmesi
                int id = resultSet.getInt("id");
                String ad = resultSet.getString("username");
                String password = resultSet.getString("password");
                // ... Diğer sütunların alınması
                System.out.println("ID: " + id + ", Ad: " + ad + ", Password: "+ password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Kapatma işlemleri
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
