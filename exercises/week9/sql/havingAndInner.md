## 🧮 7 Exercises Using `HAVING`

1. **Which products have been ordered more than 200 times in total?**

<details>
<summary>💡 Hint</summary>
Use `SUM(Quantity)` with `GROUP BY ProductID` and a `HAVING` clause.
</details>


---

2. **Which customers have placed more than 10 orders?**

<details>
<summary>💡 Hint</summary>
Use `COUNT(OrderID)` grouped by `CustomerID`, and `HAVING COUNT(OrderID) > 10`.
</details>

---

3. **List suppliers who supply more than 5 products.**

<details>
<summary>💡 Hint</summary>
Use `COUNT(ProductID)` grouped by `SupplierID` in the `Products` table.
</details>

---

4. **Find categories that contain at least one product with an average unit price above 40.**

<details>
<summary>💡 Hint</summary>
Group by `CategoryID` and use `AVG(UnitPrice) > 40` in the `HAVING` clause.
</details>

---

5. **List order IDs where the total quantity ordered exceeds 100.**

<details>
<summary>💡 Hint</summary>
Group `Order Details` by `OrderID` and use `SUM(Quantity)` in the `HAVING`.
</details>

---

<!-- 6. **Find all customers whose average order quantity is less than 20.**

<details>
<summary>💡 Hint</summary>
Group `Order Details` by `OrderID`, join to `Orders`, then group by `CustomerID`.
</details> -->

---

7. **Which products have an average ordered quantity between 20 and 40?**

<details>
<summary>💡 Hint</summary>
Group by `ProductID` and use `HAVING AVG(Quantity) BETWEEN 20 AND 40`.
</details>

---

## 🧠 15 Exercises with Inner Queries (Progressive Difficulty)

### 🧩 Level 1: Single-Level Inner Queries

1. **Find the product names of products that have the highest unit price.**

<details>
<summary>💡 Hint</summary>
Use a subquery to find `MAX(UnitPrice)` and use it in the `WHERE` clause.
</details>

---

2. **Find all customers who placed the most recent order.**

<details>
<summary>💡 Hint</summary>
Use a subquery to get the latest `OrderDate`, then filter `Orders` by that date.
</details>

---

3. **List all products that have never been ordered.**

<details>
<summary>💡 Hint</summary>
Use a subquery with `SELECT DISTINCT ProductID FROM Order Details` and check which `ProductID`s in `Products` are NOT in that list.
</details>

---

4. **Find the name of the supplier who supplies the most expensive product.**

<details>
<summary>💡 Hint</summary>
Use a subquery to get the `SupplierID` for the product with the highest `UnitPrice`, then query `Suppliers`.
</details>

---

5. **List all orders where the quantity ordered was more than the average quantity of all orders.**

<details>
<summary>💡 Hint</summary>
Use a subquery to get `AVG(Quantity)` and compare it in `WHERE`.
</details>

---

### 🧩 Level 2: Two Nested Queries

6. **Find the product names of all products that were ordered in the order with the highest total quantity.**

<details>
<summary>💡 Hint</summary>
Subquery 1: group `Order Details` by `OrderID` to get total quantity  
Subquery 2: get `OrderID` with the max total  
Outer query: find product names using that `OrderID`.
</details>

---

7. **List all customers who have only placed one order.**

<details>
<summary>💡 Hint</summary>
Use a subquery to group `Orders` by `CustomerID` and count — then filter to `= 1` and use that in the outer query.
</details>

---

8. **Find the average unit price of products ordered by customers from London.**

<details>
<summary>💡 Hint</summary>
Subquery 1: get `CustomerID`s from London  
Subquery 2: get `OrderID`s from those customers  
Subquery 3: get `ProductID`s from those orders  
Outer query: average `UnitPrice` for those products.
</details>

---

9. **Find names of customers who have ordered a product with less than 10 units in stock.**

<details>
<summary>💡 Hint</summary>
Subquery: get `ProductID`s with `UnitsInStock < 10`  
Then `OrderID`s that contain those products  
Then `CustomerID`s and finally `CompanyName`s.
</details>

---

10. **Find categories where at least one product was ordered in quantity over 50.**

<details>
<summary>💡 Hint</summary>
Subquery 1: Get `ProductID`s from `Order Details` where `Quantity > 50`  
Subquery 2: Get `CategoryID`s for those products  
Outer query: Get category info.
</details>

---

### 🧩 Level 3: Three-Level Inner Queries

11. **List the product name(s) that were ordered in the first order placed by the customer who placed the last order.**

<details>
<summary>💡 Hint</summary>
1. Get `CustomerID` from last order  
2. Get their earliest order  
3. Get product names from that order.
</details>

---

12. **Find customers who have ordered the product with the lowest unit price.**

<details>
<summary>💡 Hint</summary>
1. Subquery: Get `ProductID` with lowest price  
2. Subquery: Get `OrderID`s where that product was ordered  
3. Outer query: Get `CustomerID`s from those orders.
</details>

---

13. **Find the name of the customer who ordered the largest total quantity across all orders.**

<details>
<summary>💡 Hint</summary>
1. Group `Order Details` by `OrderID` and sum quantities  
2. Join with `Orders` to get `CustomerID`s  
3. Group by `CustomerID` and sum again → get the max.
</details>

---

14. **Which product was ordered the most times by customers in Mexico?**

<details>
<summary>💡 Hint</summary>
1. Get `CustomerID`s from Mexico  
2. Get their orders → get product quantities  
3. Find most ordered product from that list.
</details>

---

15. **Which customer has the highest average order quantity per product?**

<details>
<summary>💡 Hint</summary>
1. Use `Order Details` to calculate avg quantity per order per customer  
2. Use joins and grouping  
3. Return the top result.
</details>

---

