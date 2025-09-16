package controller;

import model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import db.DBConnection;

public class CustomerController {

    public static boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        // Updated to match your Customer class fields
        PreparedStatement stm = connection.prepareStatement("INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)");
        stm.setObject(1, customer.getCustID());
        stm.setObject(2, customer.getCustTitle());
        stm.setObject(3, customer.getCustName());
        stm.setObject(4, customer.getDOB());
        stm.setObject(5, customer.getSalary());
        stm.setObject(6, customer.getCustAddress());
        stm.setObject(7, customer.getCity());
        stm.setObject(8, customer.getProvince());
        stm.setObject(9, customer.getPostalCode());
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException{
        // Updated column names to match your database schema
        PreparedStatement stm = DBConnection.getInstance().getConnection()
                .prepareStatement("UPDATE Customer SET custTitle=?, custName=?, DOB=?, salary=?, custAddress=?, city=?, province=?, postalCode=? WHERE custID=?");
        stm.setObject(1, customer.getCustTitle());
        stm.setObject(2, customer.getCustName());
        stm.setObject(3, customer.getDOB());
        stm.setObject(4, customer.getSalary());
        stm.setObject(5, customer.getCustAddress());
        stm.setObject(6, customer.getCity());
        stm.setObject(7, customer.getProvince());
        stm.setObject(8, customer.getPostalCode());
        stm.setObject(9, customer.getCustID());
        return stm.executeUpdate() > 0;
    }

    public static Customer searchCustomer(String id) throws ClassNotFoundException, SQLException{
        // Updated column name from 'id' to 'custID'
        PreparedStatement stm = DBConnection.getInstance().getConnection()
                .prepareStatement("SELECT * FROM Customer WHERE custID=?");
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            // Create Customer object using default constructor and setters
            Customer customer = new Customer();
            customer.setCustID(rst.getString("custID"));
            customer.setCustTitle(rst.getString("custTitle"));
            customer.setCustName(rst.getString("custName"));
            customer.setDOB(rst.getDate("DOB") != null ? rst.getDate("DOB").toLocalDate() : null);
            customer.setSalary(rst.getDouble("salary"));
            customer.setCustAddress(rst.getString("custAddress"));
            customer.setCity(rst.getString("city"));
            customer.setProvince(rst.getString("province"));
            customer.setPostalCode(rst.getString("postalCode"));
            return customer;
        }
        return null;
    }

    public static boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException{
        // Updated column name and used PreparedStatement for security
        PreparedStatement stm = DBConnection.getInstance().getConnection()
                .prepareStatement("DELETE FROM Customer WHERE custID=?");
        stm.setObject(1, id);
        return stm.executeUpdate() > 0;
    }

    public static ArrayList<String> getAllCustomerIds() throws ClassNotFoundException, SQLException{
        // Updated column name from 'id' to 'custID'
        PreparedStatement stm = DBConnection.getInstance().getConnection()
                .prepareStatement("SELECT custID FROM Customer");
        ResultSet rst = stm.executeQuery();
        ArrayList<String> idSet = new ArrayList<>();
        while (rst.next()) {
            idSet.add(rst.getString("custID"));
        }
        return idSet;
    }

    public static ArrayList<Customer> getAllCustomers() throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection()
                .prepareStatement("SELECT * FROM Customer");
        ResultSet rst = stm.executeQuery();
        ArrayList<Customer> customerList = new ArrayList<>();
        while(rst.next()){
            // Create Customer object using default constructor and setters
            Customer customer = new Customer();
            customer.setCustID(rst.getString("custID"));
            customer.setCustTitle(rst.getString("custTitle"));
            customer.setCustName(rst.getString("custName"));
            customer.setDOB(rst.getDate("DOB") != null ? rst.getDate("DOB").toLocalDate() : null);
            customer.setSalary(rst.getDouble("salary"));
            customer.setCustAddress(rst.getString("custAddress"));
            customer.setCity(rst.getString("city"));
            customer.setProvince(rst.getString("province"));
            customer.setPostalCode(rst.getString("postalCode"));
            customerList.add(customer);
        }
        return customerList;
    }
}