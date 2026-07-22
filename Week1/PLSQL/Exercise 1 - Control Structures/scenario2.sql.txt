BEGIN

    FOR rec IN
    (
        SELECT CustomerID,
               CustomerName
        FROM Customers
        WHERE Balance > 10000
    )
    LOOP

        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE(
            rec.CustomerName || ' promoted to VIP.'
        );

    END LOOP;

    COMMIT;

END;
/

SELECT * FROM Customers;