use edubridge;
select * from customers;
select * from customers order by country;
SELECT COUNT(CustomerID), Country FROM Customers GROUP BY Country;
SELECT COUNT(CustomerID), Country FROM Customers GROUP BY Country HAVING COUNT(CustomerID) > 5;
SELECT COUNT(CustomerID), Country FROM Customers GROUP BY Country HAVING COUNT(CustomerID) > 5 ORDER BY COUNT(CustomerID) DESC;
