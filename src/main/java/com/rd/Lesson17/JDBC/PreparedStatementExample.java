package com.rd.Lesson17.JDBC;


import java.sql.*;

public class PreparedStatementExample {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String kullaniciAdi = "postgres";
        String sifre = "password";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);

            // Kullanıcıdan alınan girişler
            String kullaniciAdiGiris = "test";


            String sqlSorgusu = "SELECT * FROM test_user WHERE username = ?";
            preparedStatement = connection.prepareStatement(sqlSorgusu);

            // Parametreler atanıyor
            preparedStatement.setString(1, kullaniciAdiGiris);


            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                // Diğer sütunların alınması
                System.out.println("ID: " + id + ", Username: " + username + ", Password: " + password);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
