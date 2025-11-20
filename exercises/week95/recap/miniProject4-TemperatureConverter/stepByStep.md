## 🪜 Step-by-Step Plan (With Explanations)

### **1. Import and Setup Scanner**

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

> 🔍 As always, we use `Scanner` to get input from the user.

---

### **2. Ask the User Which Conversion They Want**

```java
System.out.print("Type C to convert from Celsius to Fahrenheit, or F to convert from Fahrenheit to Celsius: ");
String choice = scanner.nextLine().toUpperCase();
```

> 💬 We read the user's choice as a string.
>  
> ✨ `.toUpperCase()` makes it easier to compare later without worrying about lowercase vs uppercase.

---

### **3. Ask for the Temperature to Convert**

```java
System.out.print("Enter the temperature: ");
double inputTemp = Double.parseDouble(scanner.nextLine());
```

> 🔢 `Double.parseDouble()` converts the string to a `double` so we can do math.  
> This reinforces input parsing and numeric types.

---

### **4. Do the Conversion Using If-Else**

```java
double converted;

if (choice.equals("C")) {
    // Celsius to Fahrenheit
    converted = (inputTemp * 9 / 5) + 32;
    System.out.println(inputTemp + "°C is " + converted + "°F");
} else if (choice.equals("F")) {
    // Fahrenheit to Celsius
    converted = (inputTemp - 32) * 5 / 9;
    System.out.println(inputTemp + "°F is " + converted + "°C");
} else {
    System.out.println("Invalid choice.");
}
```

> 🧪 Here’s where students practice:
> - Basic arithmetic
> - Order of operations (important when writing formulas!)
> - Conditional logic with `if-else`

---

### **5. (Optional) Cast the Result to an Int**

```java
int rounded = (int) converted;
System.out.println("Rounded: " + rounded + "°");
```

> 🧙‍♀️ You can add this to demonstrate *casting* — explicitly converting a `double` to an `int`, which chops off the decimal part.  
> It's a great conversation starter about *loss of precision*.

---

### **6. (Optional Bonus) Wrap the Logic in a Static Method**

If you want to review methods:

```java
public static double convertTemp(double temp, String direction) {
    if (direction.equals("C")) {
        return (temp * 9 / 5) + 32;
    } else if (direction.equals("F")) {
        return (temp - 32) * 5 / 9;
    } else {
        System.out.println("Invalid direction.");
        return 0;
    }
}
```

And use it like this:

```java
double result = convertTemp(inputTemp, choice);
System.out.println("Converted: " + result);
```

> 🧠 This helps them practice parameter passing and return values — building reusable logic!

---

## 🔁 Recap of Concepts Practiced

| Concept | Example | Explanation |
|--------|---------|-------------|
| `Scanner` | `new Scanner(System.in)` | Read input from keyboard |
| `String` | `"C"` or `"F"` | User input used in condition |
| `.toUpperCase()` | `input.toUpperCase()` | Normalizes case |
| `Double.parseDouble()` | Converts string to a number |
| Math operators | `*`, `/`, `+`, `-` | Used in formulas |
| `if-else` | Determine which formula to use |
| Casting | `(int) converted` | Remove decimal part |
| Static methods | `public static double...` | Encapsulate logic for reuse |

---