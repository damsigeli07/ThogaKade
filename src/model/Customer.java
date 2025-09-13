package model;

import java.time.LocalDate;

public class Customer {
    private String custID;
    private String custTitle;
    private String custName;
    private LocalDate DOB;
    private double salary;
    private String custAddress;
    private String city;
    private String province;
    private String postalCode;

    public Customer() {
    }

    public Customer(String custID, String custTitle, String custName, LocalDate DOB, 
                   double salary, String custAddress, String city, String province, String postalCode) {
        this.custID = custID;
        this.custTitle = custTitle;
        this.custName = custName;
        this.DOB = DOB;
        this.salary = salary;
        this.custAddress = custAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    // Getters and Setters
    public String getCustID() { return custID; }
    public void setCustID(String custID) { this.custID = custID; }

    public String getCustTitle() { return custTitle; }
    public void setCustTitle(String custTitle) { this.custTitle = custTitle; }

    public String getCustName() { return custName; }
    public void setCustName(String custName) { this.custName = custName; }

    public LocalDate getDOB() { return DOB; }
    public void setDOB(LocalDate DOB) { this.DOB = DOB; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getCustAddress() { return custAddress; }
    public void setCustAddress(String custAddress) { this.custAddress = custAddress; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getProvince() { return province; }
    public void setProvince(String province) { this.province = province; }

    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }
}
