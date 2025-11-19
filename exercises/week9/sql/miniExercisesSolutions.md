

## 🧠 10 Mini SELECT Exercises

Each one should result in a single query using what they know.

1. **Find all products that have more than 100 units in stock.**
SELECT * FROM northwind.Products
WHERE UnitsInStock > 100;
2. **Get the first 5 customers whose company name starts with the letter "S".**
SELECT * FROM northwind.Customers
WHERE CompanyName LIKE "S%"
LIMIT 5;
3. **Show all orders that contain product ID 42.**
SELECT * FROM northwind.`Order Details`
WHERE ProductID = 42;
4. **Which products have exactly 0 units on order?**
SELECT * FROM northwind.Products
WHERE UnitsOnOrder = 0;
5. **List 10 products with a `UnitPrice` between 15 and 30.**
SELECT * FROM northwind.Products
WHERE UnitPrice BETWEEN 15 AND 30
LIMIT 10;
6. **Find all customers whose company name ends in "Inc.".**
SELECT * FROM northwind.Customers
WHERE CompanyName LIKE "%Inc.";
7. **Show all products that have less than 10 units in stock and more than 0 units on order.**
SELECT * FROM northwind.Products
WHERE UnitsInStock < 10 AND UnitsOnOrder > 0;
8. **List all customers with a `CustomerID` that contains the letter "A".**
SELECT * FROM northwind.Customers
WHERE CustomerID LIKE "%A%";
9. **Find the first 3 entries in the `Order Details` table where quantity is greater than 50.**
SELECT * FROM northwind.`Order Details`
WHERE Quantity > 50
LIMIT 3;
10. **Show the details of the product with `ProductName` equal to "Chai".**
SELECT * FROM northwind.`Order Details`
WHERE Quantity > 50
LIMIT 3;
---

## 🧩 5 Mini Quests (Chained Queries)

These require multiple steps or exploration — either executing multiple queries or navigating tables logically.
Please note, it's absolutely acceptable to manually enter the result from 1 query into the next query... for now 😈
 
1. **What is the product name of the last item that the customer “The Big Cheese” ordered?**

<details>
<summary>💡 Hint</summary>

Get CustomerID from `Customers` → find their `Orders` → pick the latest → find `OrderID` in `Order Details` → get `ProductID` → get `ProductName`.

</details>

---

2. **How many units in stock are there for the product ordered in the largest quantity?**

<details>
<summary>💡 Hint</summary>

Look in `Order Details` for max `Quantity` → get `ProductID` → look it up in `Products`.

</details>

---

3. **Which customers have ordered product ID 7?**

<details>
<summary>💡 Hint</summary>

Use `Order Details` to find `OrderID`s with `ProductID = 7` → find `CustomerID`s via `Orders` → get customer names.

</details>

---

4. **Find the most recent order placed and what product(s) were included in it.**

<details>
<summary>💡 Hint</summary>

Get latest `OrderDate` in `Orders` → get `OrderID` → look up `Order Details` → find `ProductID`s → get `ProductName`s.

</details>

---

5. **Which products are in stock, have units on order, and have been ordered at least once?**

<details>
<summary>💡 Hint</summary>

Filter `Products` by `UnitsInStock > 0 AND UnitsOnOrder > 0`, then check which of these `ProductID`s appear in `Order Details`.

</details>


---
