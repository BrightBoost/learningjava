SELECT SUM(Quantity), ProductID FROM northwind.`Order Details`
GROUP BY ProductID
HAVING SUM(Quantity) > 200;

SELECT COUNT(*), CustomerID FROM northwind.Orders
GROUP BY CustomerID
HAVING COUNT(*) > 10;