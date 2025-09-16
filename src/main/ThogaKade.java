package main;

import java.sql.*;

public class ThogaKade {

    public static void main(String args[]) {
        String SQL = "Select * From Customer";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ThogaKade", "root", "damsi20#20");
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery(SQL);
            while (rst.next()) { //move first row
                String id = rst.getString("custID");
                String name = rst.getString("custName");
                String address = rst.getString("custAddress");
                double salary = rst.getDouble("salary");
                System.out.println(id + "\t" + name + "\t" + address + "\t" + salary);
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found...");
            System.out.println(ex.getMessage());
            return;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
