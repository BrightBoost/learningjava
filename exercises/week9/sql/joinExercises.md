Alternative exercise: Get some sleep (after class though)
It's worth MORE points than the exercises below.
Not that I'm grading it.

---

## **1–5: Simple Joins**

1. **List all products with their supplier company name.**

<details><summary>💡 Hint</summary>Join `Products` and `Suppliers` using `SupplierID`.</details>

---

2. **Show each order with the company name of the customer who placed it.**

<details><summary>💡 Hint</summary>Join `Orders` with `Customers` using `CustomerID`.</details>

---

3. **Show all products with their category names.**

<details><summary>💡 Hint</summary>Join `Products` with `Categories` using `CategoryID`.</details>

---

4. **List all employees with their titles.**

<details><summary>💡 Hint</summary>Use the `Employees` table; no join needed. Consider this a freebie warmup.</details>

---

5. **Show the unit price and supplier name for each product.**

<details><summary>💡 Hint</summary>Join `Products` and `Suppliers`, then select `UnitPrice` and `CompanyName`.</details>

---

## 🟡 **6–10: Two- and Three-Table Joins**

6. **List all orders with the customer name and order date.**

<details><summary>💡 Hint</summary>Join `Orders` with `Customers`.</details>

---

7. **Show order details including order ID, product name, and quantity.**

<details><summary>💡 Hint</summary>Join `Order Details` with `Products`.</details>

---

8. **List each order with its order date and the name of each product in that order.**

<details><summary>💡 Hint</summary>Join `Orders` → `Order Details` → `Products`.</details>

---

9. **Show products along with their supplier and category names.**

<details><summary>💡 Hint</summary>Join `Products` with both `Suppliers` and `Categories`.</details>

---

10. **List all order items including order date, customer name, product name, and quantity.**

<details><summary>💡 Hint</summary>Join `Orders`, `Customers`, `Order Details`, and `Products`.</details>

---

## 🟠 **11–15: Joins with Filtering**

11. **List all orders placed by customers in Germany.**

<details><summary>💡 Hint</summary>Join `Orders` with `Customers`, then filter `Country = 'Germany'`.</details>

---

12. **Show all order details for products with unit price above 50.**

<details><summary>💡 Hint</summary>Join `Order Details` with `Products`, then filter `UnitPrice > 50`.</details>

---

13. **Find products from suppliers in the USA.**

<details><summary>💡 Hint</summary>Join `Products` with `Suppliers`, then filter by `Country = 'USA'`.</details>

---

14. **List all orders that include the product "Chai".**

<details><summary>💡 Hint</summary>Join `Order Details` → `Products`, filter `ProductName = 'Chai'`, then get order info.</details>

---

15. **Find customers who ordered products in the "Beverages" category.**

<details><summary>💡 Hint</summary>Join `Orders` → `Order Details` → `Products` → `Categories`, then filter by category name.</details>

---

## 🔵 **16–20: Joins with Aggregates and `GROUP BY`**

16. **Show total quantity ordered per product.**

<details><summary>💡 Hint</summary>Join `Order Details` and `Products`, then group by `ProductName` and sum `Quantity`.</details>

---

17. **Find how many orders each customer has placed.**

<details><summary>💡 Hint</summary>Join `Orders` with `Customers`, group by customer.</details>

---

18. **List the number of products supplied by each supplier.**

<details><summary>💡 Hint</summary>Join `Products` with `Suppliers`, then group by supplier.</details>

---

19. **For each category, show the average unit price of its products.**

<details><summary>💡 Hint</summary>Join `Products` with `Categories`, then use `AVG(UnitPrice)` grouped by category name.</details>

---

20. **Show the total quantity of items ordered per customer.**

<details><summary>💡 Hint</summary>Join `Customers` → `Orders` → `Order Details`, group by customer, sum `Quantity`.</details>

---

## 🟣 **21–25: Joins with Subqueries or `HAVING`**

21. **List customers who ordered more than 300 total items.**

<details><summary>💡 Hint</summary>Same as Exercise 20, but add `HAVING SUM(Quantity) > 300`.</details>

---

22. **Show product names that were ordered more than 50 times in total.**

<details><summary>💡 Hint</summary>Join `Order Details` and `Products`, group by product, `HAVING SUM(Quantity) > 50`.</details>

---

23. **Find the supplier of the most expensive product.**

<details><summary>💡 Hint</summary>Subquery to get `MAX(UnitPrice)` → get `SupplierID` → join with `Suppliers`.</details>

---

24. **List the top 5 customers by total quantity ordered.**

<details><summary>💡 Hint</summary>Join `Customers` → `Orders` → `Order Details`, group by customer, sort and limit.</details>

---

25. **List the product(s) ordered in the highest-quantity single order.**

<details><summary>💡 Hint</summary>Subquery: group by `OrderID`, order by `SUM(Quantity) DESC`, then get product info from top `OrderID`.</details>

---
