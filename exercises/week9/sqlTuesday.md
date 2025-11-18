# **1. Simple SELECT**

### **Northwind**

1. Select all product names from the `products` table.
2. Select all columns from the `employees` table.
3. Select the company name and contact name from `customers`.
4. Select order IDs and order dates from `orders`.

### **Sakila**

1. Select all film titles from `film`.
2. Select all columns from `actor`.
3. Select customer first names and last names from `customer`.
4. Select rental IDs and rental dates from `rental`.

---

# **2. ORDER BY**

### **Northwind**

1. List all customers ordered by `CompanyName` alphabetically.
2. Show all products ordered by `UnitPrice` descending.
3. List employees sorted by `HireDate` oldest → newest.
4. List orders sorted by `OrderDate` newest → oldest.

### **Sakila**

1. List all films ordered alphabetically by title.
2. Show customers ordered by `last_name` then `first_name`.
3. List stores ordered by `store_id` descending.
4. Show payments ordered by `amount` descending.

---

# **3. WHERE (simple + complex)**

### **Northwind**

1. Find all products with `UnitsInStock = 0`.
2. List all customers from Germany.
3. Find employees with the title “Sales Representative”.
4. Find products with `UnitPrice > 50` AND `UnitsInStock > 20`.

### **Sakila**

1. Find all films with rating “PG”.
2. List actors with the first name “NICK”.
3. Find customers that are active (`active = 1`).
4. Show all films with rental duration > 5 AND length < 90 minutes.

---

# **4. BETWEEN**

### **Northwind**

1. Find products priced between 10 and 20.
2. Show orders placed between ‘1997-01-01’ and ‘1997-12-31’.
3. List employees hired between 1992 and 1994.
4. Find products with inventory between 50 and 100 units.

### **Sakila**

1. Find films released between 2001 and 2005.
2. Show payments between $5 and $10.
3. List rentals from June 2005.
4. Find films with length between 80 and 120 minutes.

---

# **5. LIKE**

### **Northwind**

1. Find customers whose company name starts with “A”.
2. List products ending in “ing”.
3. Find employees whose last name contains “er”.
4. Find customers with contact names containing “an”.

### **Sakila**

1. Find films starting with “THE”.
2. List actors whose last name begins with “S”.
3. Find customers whose email ends with “.org”.
4. Show all cities containing the word “VILLE”.

---

# **6. NULL Values**

### **Northwind**

1. List orders where `ShippedDate` is NULL.
2. Find employees without a `ReportsTo` manager.
3. Show products with NULL `QuantityPerUnit`.
4. List customers missing a fax number (`Fax IS NULL`).

### **Sakila**

1. Show payments where `payment_date` is NULL.
   (Depending on dataset, might be none – good discussion point!)
2. List actors with no middle name (if applicable in dataset).
3. Show customers with no `create_date` (if possible).
4. Show inventory records with NULL `store_id` (if any).
   (*If none exist, ask them to explain why.*)

---

# **7. DISTINCT**

### **Northwind**

1. Show all distinct customer countries.
2. Show distinct product categories (via `CategoryID`).
3. Distinct titles from the employees table.
4. Distinct ship countries from orders.

### **Sakila**

1. Show distinct film ratings.
2. Distinct cities from the `address` table.
3. Distinct language IDs used in `film`.
4. Distinct staff IDs from `rental`.

---

# **8. Aggregate Functions (COUNT, SUM, AVG, MIN, MAX)**

### **Northwind**

1. Count how many products there are.
2. Find the average unit price of all products.
3. Show the maximum freight amount from orders.
4. Find the total units in stock across all products.

### **Sakila**

1. Count all films.
2. Find the average film length.
3. Show the highest payment amount.
4. Find the total number of rentals.

---

# **9. GROUP BY**

### **Northwind**

1. Show how many customers are in each country.
2. Count orders for each employee.
3. Sum freight costs per ship country.
4. Show the number of products in each category.

### **Sakila**

1. Count films per rating.
2. Count customers per store.
3. Sum payments per staff member.
4. Count rentals per inventory item.

---

# **10. Computed Fields + AS**

### **Northwind**

1. Display product name and price with VAT (price × 1.21) AS `PriceWithVAT`.
2. Show employee full name using `CONCAT(firstname, ' ', lastname)` AS `FullName`.
3. Show order ID and (UnitPrice × Quantity) AS `LineTotal` from `order_details`.
4. Show product name and (UnitsInStock - UnitsOnOrder) AS `Available`.

### **Sakila**

1. Show film title and (rental_rate × 3) AS `ThreeDayCost`.
2. Show customer full name using CONCAT.
3. Show payment ID and (amount * 100) AS `Cents`.
4. Show film title and (length / 60) AS `LengthInHours`.

---

# **11. HAVING**

### **Northwind**

1. Show countries with more than 5 customers.
2. Show employees with more than 10 orders handled.
3. Show ship countries with total freight > 1000.
4. Show product categories with more than 10 products.

### **Sakila**

1. Show ratings that have more than 200 films.
2. Show cities with more than 20 customers.
3. Show staff members with total payments > 3000.
4. Show languages used by more than 100 films.

---

# **12. Nested Queries / Subqueries**

### **Northwind**

1. Find all products priced above the average product price.
2. List customers who placed at least one order.
3. List employees who manage (ReportsTo) someone.
4. Show products in the same category as “Chai”.

### **Sakila**

1. Find all films longer than the average film length.
2. List customers who have made at least one rental.
3. Show actors who appear in the film “ACADEMY DINOSAUR”.
4. List films in the same category as “Comedy”.

---

Nice one, I love these “manager question” style tasks 🤓

Here are **10 more challenging, all-in-one exercises**.
No JOINs needed (they *can* use subqueries, GROUP BY, HAVING, aggregates, etc.).
I’ve made them realistic management questions.

---

## CHALLENGE: Northwind — 5 “Management Report” Exercises

**N1. Product Performance Snapshot**
Management asks: *“Which products are clearly underperforming? Give us a list of products that are in stock but rarely ordered.”*
Create a report that shows each product’s name, units in stock, and how many times it appears in `order_details`, and filter it so that only products with **plenty of stock** but **very few orders** appear.

---

**N2. High-Value Countries**
Management asks: *“For which countries are we shipping a lot of value?”*
Create a report per ship country that shows the **number of orders** and the **total freight** for that country, but only include countries that clearly stand out as strong markets.

---

**N3. Employee Order Load**
Management asks: *“Are any sales reps overloaded compared to the others?”*
Create a report per employee that shows their full name and how many orders they handled. Only show employees whose number of orders is **above the overall average** number of orders per employee.

---

**N4. Expensive Product Focus**
Management asks: *“We want to focus on our premium products. Which categories contain products that are generally high priced?”*
Create a report per category (using only the IDs or names you can get without JOINs) that shows the **average unit price** and the **number of products** in that category. Only include categories where the **average price** is relatively high compared to the other categories.

---

**N5. Slow Shipping Detection**
Management asks: *“Where are we slow in shipping?”*
Create a report that, for each ship country, shows the **average delay** between `OrderDate` and `ShippedDate` (you may ignore orders that haven’t shipped yet). Only show countries with a noticeably higher average delay than others.

---

## CHALLENGE: Sakila — 5 “Management Report” Exercises

**S1. Top-Earning Staff**
Management asks: *“Which staff members bring in the most money?”*
Create a report per staff member showing **how many payments** they processed and the **total amount** they collected, and highlight only the staff whose total collected amount is **above the overall average**.

---

**S2. Profitable Rental Durations**
Management asks: *“Is it worth keeping long rental-duration films, or do shorter films also bring in good income?”*
Create a report that groups films by their `rental_duration` and shows the **number of films**, and the **average rental rate** for each duration. Identify which rental durations look the most profitable.

---

**S3. Customer Activity Segmentation**
Management asks: *“Which customers are active enough to be considered for a loyalty program?”*
Based on the `rental` or `payment` data, create a report with each customer’s ID and their **total number of rentals or payments**. Only include customers whose activity is clearly higher than the typical customer.

---

**S4. Rating vs. Length Insight**
Management asks: *“Are certain film ratings associated with longer films?”*
Create a report per rating that shows the **average film length** and the **number of films** for that rating. Use this to identify ratings where films tend to be significantly longer than the global average length.

---

**S5. Long Tail of Unpopular Films**
Management asks: *“Do we have a long tail of films that almost nobody rents?”*
Create a report that shows each film’s title and how many times it appears in the `rental` table. Then filter the result to show only films that are rented **far below the average** rental count per film.

---

