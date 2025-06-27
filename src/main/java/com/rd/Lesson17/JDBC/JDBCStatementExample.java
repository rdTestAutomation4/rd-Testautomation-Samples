package com.rd.Lesson17.JDBC;


import java.sql.*;

public class JDBCStatementExample {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String kullaniciAdi = "root";
        String sifre = "123456";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            statement = connection.createStatement();
            String degisken = " 'OR '1' = '1'";

            String sqlSorgusu = "SELECT * FROM users WHERE id = 'OR '1' = '1'";

            resultSet = statement.executeQuery(sqlSorgusu);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String ad = resultSet.getString("username");
                String password = resultSet.getString("password");
                // ... Diğer sütunların alınması
                System.out.println("ID: " + id + ", Ad: " + ad + " password: " + password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
