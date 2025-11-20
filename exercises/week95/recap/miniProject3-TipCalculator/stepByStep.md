## 🪜 Step-by-Step Plan (With Explanations):

### **1. Get User Input with Scanner**

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

> 🧠 We import and create a `Scanner` object to read input from the user. This allows us to ask questions and capture answers.

---

### **2. Ask for the Bill Amount**

```java
System.out.print("Enter the bill amount: ");
double bill = Double.parseDouble(scanner.nextLine());
```

> 🧾 This gets the bill amount as a `String`, then uses `Double.parseDouble()` to convert it to a `double` so we can do math on it.  
> 💡 This reinforces parsing user input — a recurring real-world task.

---

### **3. Ask for the Tip Percentage**

```java
System.out.print("Enter the tip percentage: ");
double tipPercentage = Double.parseDouble(scanner.nextLine());
```

> 💰 The user might enter `10` for 10%, or `15` for 15%. We again parse to `double` so we can calculate the actual tip.

---

### **4. Calculate the Tip and Total**

```java
double tipAmount = bill * (tipPercentage / 100);
double totalAmount = bill + tipAmount;
```

> 🧮 We convert the percentage to a decimal by dividing by 100 (e.g. `10` becomes `0.10`)  
> Then we multiply it by the bill to get the **tip**, and add it to the bill for the **total**.

---

### **5. Round with Math.ceil() and Math.floor()**

```java
double roundedUpTotal = Math.ceil(totalAmount);
double roundedDownTotal = Math.floor(totalAmount);
```

> 🔢 `Math.ceil()` rounds *up* to the next whole number (e.g. `12.1` → `13.0`)  
> `Math.floor()` rounds *down* (e.g. `12.9` → `12.0`)  
> A great time to mention why we might want to round prices (e.g. when splitting a bill)!

---

### **6. Show Results to the User**

```java
System.out.println("Tip amount: €" + tipAmount);
System.out.println("Total amount: €" + totalAmount);
System.out.println("Rounded up: €" + roundedUpTotal);
System.out.println("Rounded down: €" + roundedDownTotal);
```

> 💬 Here they see how to show calculated values back to the user. The euro sign is optional and fun to localize the output.

---

## 🔁 Recap of Concepts Practiced

| Concept | Example | Explanation |
|--------|---------|-------------|
| `Scanner` | `new Scanner(System.in)` | Get user input |
| `nextLine()` | `scanner.nextLine()` | Read full input line |
| `Double.parseDouble()` | `Double.parseDouble("12.5")` | Convert string to a number |
| Arithmetic | `bill * (tip / 100)` | Do math with user input |
| `Math.ceil()` | `Math.ceil(12.1)` → `13.0` | Round **up** to nearest whole |
| `Math.floor()` | `Math.floor(12.9)` → `12.0` | Round **down** to nearest whole |
| String concatenation | `"€" + tipAmount` | Mix strings with variables in output |
