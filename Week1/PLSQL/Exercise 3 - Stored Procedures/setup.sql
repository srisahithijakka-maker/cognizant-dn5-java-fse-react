-- Create Accounts table
CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER,
    CONSTRAINT fk_acc_customer
    FOREIGN KEY (CustomerID)
    REFERENCES Customers(CustomerID)
);

-- Insert Accounts data
INSERT INTO Accounts VALUES (201,1,'Savings',25000);
INSERT INTO Accounts VALUES (202,2,'Savings',18000);
INSERT INTO Accounts VALUES (203,3,'Current',12000);
INSERT INTO Accounts VALUES (204,4,'Savings',7000);
INSERT INTO Accounts VALUES (205,5,'Current',35000);
INSERT INTO Accounts VALUES (206,6,'Savings',15000);

COMMIT;

-- Create Employees table
CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(50),
    Department VARCHAR2(30),
    Salary NUMBER
);

-- Insert Employees data
INSERT INTO Employees VALUES (101,'Rahul Mehta','IT',50000);
INSERT INTO Employees VALUES (102,'Priya Sharma','HR',42000);
INSERT INTO Employees VALUES (103,'Ankit Verma','IT',55000);
INSERT INTO Employees VALUES (104,'Neha Kapoor','Finance',48000);
INSERT INTO Employees VALUES (105,'Rohit Reddy','HR',45000);
INSERT INTO Employees VALUES (106,'Kavya Nair','Finance',52000);

COMMIT;

-- Verify
SELECT  FROM Accounts;
SELECT  FROM Employees;