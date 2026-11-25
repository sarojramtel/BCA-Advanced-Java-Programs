package databaseprogramming;

import java.sql.*;
import java.util.Scanner;

public class JDBCExample {

    public static void main(String[] args) {

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "";

        try {
            // 1. Establish database connection
            Connection con = DriverManager.getConnection(
                    url, username, password
            );

            System.out.println("Database connected successfully!");

            String name = "Ram";
            int age = 21;
            String address = "Lalitpur";

            // 3. Prepare SQL INSERT query
            String sql = "INSERT INTO student (name, age, address) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            // 4. Set values in the query
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, address);

            // 5. Execute INSERT query
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student inserted successfully!");
            }

            // 6. Retrieve all student records
            String selectSQL = "SELECT * FROM student";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(selectSQL);

            System.out.println("\n--- Student Records ---");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getInt("age") + " | " +
                                rs.getString("address")
                );
            }

            // 7. Close resources
            rs.close();
            st.close();
            ps.close();
            con.close();

            System.out.println("\nDatabase connection closed.");

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}
