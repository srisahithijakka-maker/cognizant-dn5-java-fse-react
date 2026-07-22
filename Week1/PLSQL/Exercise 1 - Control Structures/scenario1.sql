BEGIN

    FOR rec IN
    (
        SELECT CustomerID,
               CustomerName
        FROM Customers
        WHERE Age > 60
    )
    LOOP

        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE(
            'Interest rate updated for ' || rec.CustomerName
        );

    END LOOP;

    COMMIT;

END;
/

SELECT * FROM Loans;
