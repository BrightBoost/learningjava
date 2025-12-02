### Exercise 1: Find Customers by Company Name

**Goal**: Ask the user for a company name and display matching customers’ IDs and contact names.

**Requirements**:

* Use `LIKE` in SQL
* Use `Scanner` to get user input
* Use a **prepared statement**

**Example output**:

```
Enter part of the company name:
market
Matching customers:
CustomerID: MARKT - ContactName: Peter Franken
CustomerID: QUICK - ContactName: Horst Kloss
```

---

### Exercise 2: List Employees in a Given City

**Goal**: Ask the user for a city and show the full name (first + last) and title of all employees located in that city.

**Requirements**:

* Use `Scanner` and a **prepared statement**
* SQL should use `WHERE City LIKE ?`

**Example output**:

```
Enter the city:
London
Employees in London:
Nancy Davolio - Sales Representative
Andrew Fuller - Vice President, Sales
```

---

### Exercise 3: Show Orders for a Given Customer ID (with JOIN)

**Goal**: Ask the user for a customer ID and show all order IDs and order dates for that customer.

**Requirements**:

* Use `Scanner` and a **prepared statement**

**Example output**:

```
Enter the customer ID:
ALFKI
Orders for customer ALFKI:
OrderID: 10643 - Date: 1997-08-25
OrderID: 10692 - Date: 1997-10-03
```

---

### Exercise 4: Top Products in a Category (JOIN + Filtering)

**Goal**: Ask the user for a category name and show the top 5 most expensive products in that category.

**Requirements**:

* JOIN `Products` with `Categories`
* Use `Scanner`, `PreparedStatement`
* Use `ORDER BY` and `LIMIT`

**Example output**:

```
Enter category name:
beverages
Top 5 products in Beverages:
Côte de Blaye - $263.50
Château Margaux - $225.00
Sasquatch Ale - $14.00
...
```

---

### Exercise 5: Customers with High Order Count (GROUP BY + HAVING)

**Goal**: Show customers who have placed more than 10 orders.


**Example output**:

```
Customers with more than 10 orders:
CustomerID: SAVEA - Orders: 31
CustomerID: ERNSH - Orders: 30
...
```

