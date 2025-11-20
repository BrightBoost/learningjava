## 🪜 Step-by-Step Plan (With Explanations):

### **1. Import Scanner and Get User Input**

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a sentence: ");
String sentence = scanner.nextLine();
```

> 🧠 As usual: `Scanner` for input, `nextLine()` to grab the entire sentence.

---

### **2. Count the Characters**

```java
int length = sentence.length();
System.out.println("The sentence has " + length + " characters.");
```

> 🧩 `.length()` returns the number of characters in the string, including spaces and punctuation.

---

### **3. Count the Words**

```java
String[] words = sentence.split(" ");
int wordCount = words.length;
System.out.println("The sentence has " + wordCount + " words.");
```

> ✂️ `split(" ")` breaks the string wherever it finds a space. This creates an array of words — even though they haven’t learned arrays, we’re not doing anything array-ish except `.length` and reading from it.

---

### **4. Show First and Last Character**

```java
if (sentence.length() > 0) {
    System.out.println("First character: " + sentence.charAt(0));
    System.out.println("Last character: " + sentence.charAt(sentence.length() - 1));
}
```

> 🧠 `charAt(index)` gets the character at a certain position. Since strings are 0-indexed, the last character is at `length - 1`.

> 🛡️ The `if` makes sure the sentence isn't empty to avoid a crash.

---


### 🔁 Recap of Concepts Practiced:
| Concept | Example | Explanation |
|--------|--------|-------------|
| `Scanner` | `new Scanner(System.in)` | Read input |
| `nextLine()` | `scanner.nextLine()` | Get full string |
| `String.length()` | `sentence.length()` | Count characters |
| `String.split()` | `sentence.split(" ")` | Break into words |
| `String.charAt()` | `sentence.charAt(0)` | Access a specific character |
| `String[]` | `String[] words` | Create word list via split (light intro to arrays) |

---

### 🪄 Optional Enhancements:
- Count how many words start with a capital letter

