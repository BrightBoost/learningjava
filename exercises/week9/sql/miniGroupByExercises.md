## 📊 10 Mini SQL Exercises (with Aggregates & GROUP BY)

1. **How many orders has each customer placed?**

<details>
<summary>💡 Hint</summary>

Use `COUNT` with `GROUP BY CustomerID` in the `Orders` table.

</details>

---

2. **What is the total quantity ordered for each product?**

<details>
<summary>💡 Hint</summary>

Use `SUM` and `GROUP BY ProductID` in the `Order Details` table.

</details>

---

3. **Find the average unit price of all products.**

<details>
<summary>💡 Hint</summary>

Use `AVG` in the `Products` table.

</details>

---

4. **Which product has the highest unit price?**

<details>
<summary>💡 Hint</summary>

Use `MAX` in the `Products` table.

</details>

---

5. **Which customer placed the most recent order?**

<details>
<summary>💡 Hint</summary>

Use `MAX` on `OrderDate` in the `Orders` table and then look up the customer.

</details>

---

6. **Get the total number of products in each category.**

<details>
<summary>💡 Hint</summary>

Use `COUNT` and `GROUP BY CategoryID` in the `Products` table.

</details>

---

7. **What is the total number of products ordered (sum of Quantity) per OrderID?**

<details>
<summary>💡 Hint</summary>

Use `SUM` with `GROUP BY OrderID` in `Order Details`.

</details>

---

8. **What is the minimum and maximum unit price of products from each supplier?**

<details>
<summary>💡 Hint</summary>

Use `MIN` and `MAX` with `GROUP BY SupplierID` in the `Products` table.

</details>

---

9. **For each customer, how many different orders did they place and what is the average number of days between their orders?**
   *(Bonus exploratory, but just do the count for now.)*

<details>
<summary>💡 Hint</summary>

Use `COUNT` with `GROUP BY CustomerID` in the `Orders` table.

</details>

---

10. **What is the average quantity per product (not per order)?**

<details>
<summary>💡 Hint</summary>

Use `AVG` on `Quantity` and `GROUP BY ProductID` in the `Order Details` table.

</details>

---