## 🪜 Step-by-Step Plan (With Explanations):

### **1. Start with the Scanner for User Input**

```java
Scanner scanner = new Scanner(System.in);
```

> 🔍 `Scanner` is a class that allows us to read input from the keyboard.  
> `System.in` tells the Scanner to read from the standard input (the keyboard).

---

### **2. Ask for the First Number**

```java
System.out.print("Enter the first number: ");
double num1 = Double.parseDouble(scanner.nextLine());
```

> 🧠 We use `nextLine()` to read the full line, then parse it into a number with `Double.parseDouble`.  
> We use `double` instead of `int` to support decimal numbers (casting idea: we want more flexibility).

---

### **3. Ask for the Second Number**

```java
System.out.print("Enter the second number: ");
double num2 = Double.parseDouble(scanner.nextLine());
```

> ⚠️ Again, parsing a string to a number. This reinforces understanding of how data from the user is always a string — we need to *convert* it to the type we need.

---

### **4. Ask for the Operator**

```java
System.out.print("Choose an operator (+, -, *, /): ");
String operator = scanner.nextLine();
```

> 🧩 We store the operator as a `String`. We'll use `if-else` to check which operation they chose.

---

### **5. Perform the Operation (if-else)**

```java
double result;

if (operator.equals("+")) {
    result = num1 + num2;
} else if (operator.equals("-")) {
    result = num1 - num2;
} else if (operator.equals("*")) {
    result = num1 * num2;
} else if (operator.equals("/")) {
    result = num1 / num2;
} else {
    System.out.println("Unknown operator!");
    return;
}
```

> 🧠 We're using `.equals()` to compare strings (because `==` doesn’t work for object comparison like `String`).


---

### **6. Show the Result**

```java
System.out.println("Result: " + result);
```

> 💬 Simple string concatenation. Reinforces that you can mix strings and variables in a print statement.

---

### **7. Wrap Logic in a Static Method (Optional Enhancement)**

We could move the actual calculation into a **static method**:

```java
public static double calculate(double a, double b, String op) {
    if (op.equals("+")) return a + b;
    else if (op.equals("-")) return a - b;
    else if (op.equals("*")) return a * b;
    else if (op.equals("/")) return a / b;
    else {
        System.out.println("Unknown operator.");
        return 0;
    }
}
```

And call it like this:

```java
double result = calculate(num1, num2, operator);
System.out.println("Result: " + result);
```

> ✨ Now they see how data flows *into* a method (parameters), and how results come *out* (return values).

---

### 🔁 Recap of Concepts Practiced:
| Concept | Example | Explanation |
|--------|--------|-------------|
| `Scanner` | `new Scanner(System.in)` | Get user input from keyboard |
| `nextLine()` | `scanner.nextLine()` | Read full input line as a String |
| `parseDouble()` | `Double.parseDouble(...)` | Convert String to double |
| `String` | `"+"` | Store and compare operator input |
| `if-else` | `if (operator.equals(...))` | Make decisions based on conditions |
| Math Operators | `+ - * /` | Perform calculations |
| `static method` | `public static double calculate(...)` | Reusable, named logic with input and output |