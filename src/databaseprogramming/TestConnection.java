package databaseprogramming;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "";

        try {
            Connection con = DriverManager.getConnection(
                    url, user, password
            );

            System.out.println("Database connected successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
