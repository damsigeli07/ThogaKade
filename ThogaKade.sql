CREATE DATABASE ThogaKade;
USE ThogaKade;

CREATE TABLE Customer (
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    address VARCHAR(200),
    salary DECIMAL(10,2)
);

CREATE TABLE Item (
    code VARCHAR(10) PRIMARY KEY,
    description VARCHAR(200) NOT NULL,
    unitPrice DECIMAL(10,2) NOT NULL,
    qtyOnHand INT NOT NULL
);

-- Create Orders Table
CREATE TABLE Orders (
    id VARCHAR(10) PRIMARY KEY,
    date DATE NOT NULL,
    customerId VARCHAR(10),
    FOREIGN KEY (customerId) REFERENCES Customer(id)
);

CREATE TABLE OrderDetail (
    orderId VARCHAR(10),
    itemCode VARCHAR(10),
    qty INT NOT NULL,
    unitPrice DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (orderId, itemCode),
    FOREIGN KEY (orderId) REFERENCES Orders(id),
    FOREIGN KEY (itemCode) REFERENCES Item(code)
);

INSERT INTO Customer VALUES 
('C001', 'John Doe', 'Colombo', 50000.00),
('C002', 'Jane Smith', 'Kandy', 45000.00),
('C003', 'Bob Johnson', 'Galle', 55000.00);

INSERT INTO Item VALUES 
('I001', 'Rice - 1kg', 150.00, 100),
('I002', 'Sugar - 1kg', 120.00, 50),
('I003', 'Tea Packets', 80.00, 200),
('I004', 'Milk Powder - 400g', 850.00, 25),
('I005', 'Bread', 90.00, 30);
