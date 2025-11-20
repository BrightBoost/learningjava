## 🪜 Step-by-Step Plan (With Full Explanations)

---

### **1. Import the Classes**

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
```

> 📦 We're importing:
> - `LocalDate` to represent dates without time
> - `DateTimeFormatter` to format and parse dates
> - `Scanner` for user input

---

### **2. Setup Scanner and Ask for a Date**

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a date (yyyy-MM-dd): ");
String input = scanner.nextLine();
```

> 🧠 The user types a date like `"2025-04-17"` as a string. We'll parse this into a `LocalDate`.

---

### **3. Parse the Date**

```java
LocalDate date = LocalDate.parse(input);
```

> 📅 This converts the string into a proper `LocalDate` object.  
>  
> 🛡️ It expects the string to be in `yyyy-MM-dd` format — this is the ISO format, which `LocalDate.parse()` understands by default.

---

### **4. Offer Format Options to the User**

```java
System.out.println("Choose a format:");
System.out.println("1 - dd MMMM yyyy (e.g. 17 April 2025)");
System.out.println("2 - EEEE, MMM d, yyyy (e.g. Thursday, Apr 17, 2025)");
System.out.println("3 - MM/dd/yyyy (e.g. 04/17/2025)");
System.out.print("Your choice: ");
String formatChoice = scanner.nextLine();
```

> 🧠 The user now picks from a list. You can extend this later with more format options!

---

### **5. Choose the Right Formatter Based on User Input**

```java
DateTimeFormatter formatter;

if (formatChoice.equals("1")) {
    formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
} else if (formatChoice.equals("2")) {
    formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
} else if (formatChoice.equals("3")) {
    formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
} else {
    System.out.println("Invalid format choice.");
    return;
}
```

> 🎭 Each pattern defines how the date will look:
> - `dd MMMM yyyy`: 17 April 2025
> - `EEEE, MMM d, yyyy`: Thursday, Apr 17, 2025
> - `MM/dd/yyyy`: 04/17/2025  
>
> 🔡 `DateTimeFormatter.ofPattern()` creates a formatter based on the string pattern.

---

### **6. Format and Print the Date**

```java
String formatted = date.format(formatter);
System.out.println("Formatted date: " + formatted);
```

> 🧾 `date.format(formatter)` uses the pattern to turn the `LocalDate` into a readable string.

---

### ✅ Full Working Program (Recap)

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        LocalDate date = LocalDate.parse(input);

        System.out.println("Choose a format:");
        System.out.println("1 - dd MMMM yyyy (e.g. 17 April 2025)");
        System.out.println("2 - EEEE, MMM d, yyyy (e.g. Thursday, Apr 17, 2025)");
        System.out.println("3 - MM/dd/yyyy (e.g. 04/17/2025)");
        System.out.print("Your choice: ");
        String formatChoice = scanner.nextLine();

        DateTimeFormatter formatter;

        if (formatChoice.equals("1")) {
            formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        } else if (formatChoice.equals("2")) {
            formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
        } else if (formatChoice.equals("3")) {
            formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        } else {
            System.out.println("Invalid format choice.");
            return;
        }

        String formatted = date.format(formatter);
        System.out.println("Formatted date: " + formatted);
    }
}
```

---

## 🔁 Concepts Practiced

| Concept | Example | Explanation |
|--------|---------|-------------|
| `Scanner` | `scanner.nextLine()` | Get user input |
| `String` | `"2025-04-17"` | Input from user |
| `LocalDate.parse()` | Converts string to date |
| `DateTimeFormatter.ofPattern()` | Defines how date is displayed |
| `if-else` | Choose format based on user input |
| `String.format()` | Turn date into string using a formatter |




