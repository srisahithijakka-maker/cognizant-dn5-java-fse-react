CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE,
    CONSTRAINT fk_customer
        FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);

INSERT INTO Customers VALUES (1,'Aarav Sharma',68,18000,'FALSE');
INSERT INTO Customers VALUES (2,'Priya Reddy',42,14500,'FALSE');
INSERT INTO Customers VALUES (3,'Ramesh Kumar',72,9000,'FALSE');
INSERT INTO Customers VALUES (4,'Sneha Patel',29,6000,'FALSE');
INSERT INTO Customers VALUES (5,'Vikram Singh',64,25000,'FALSE');
INSERT INTO Customers VALUES (6,'Ananya Rao',35,11000,'FALSE');

COMMIT;

INSERT INTO Loans VALUES (101,1,9,SYSDATE+12);
INSERT INTO Loans VALUES (102,2,11,SYSDATE+18);
INSERT INTO Loans VALUES (103,3,10,SYSDATE+45);
INSERT INTO Loans VALUES (104,4,8,SYSDATE+6);
INSERT INTO Loans VALUES (105,5,12,SYSDATE+25);
INSERT INTO Loans VALUES (106,6,9,SYSDATE+60);

COMMIT;