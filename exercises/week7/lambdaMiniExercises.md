## **20 Mini Lambda Exercises (Level 1)**

> Each time you create a new lambda, you’ll also create your own small **functional interface** (an interface with exactly one abstract method).

---

### **1. Your first lambda**

**Concept:** A lambda is a short way to implement the method of a functional interface, without giving the class that implements it a name.

**Code example:**

```java
interface Hello {
    void sayHello();
}

public class Exercise1 {
    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Hello World!");
        hello.sayHello();
    }
}
```

**Task:**
Change it to print `"Hi from Java!"`.

---

### **2. Lambda with a parameter**

**Concept:** Lambdas can take input parameters just like methods.

**Starter code:**

```java
interface Greeter {
    void greet(String name);
}

public class Exercise2 {
    public static void main(String[] args) {
        Greeter greeter = name -> System.out.println("Hello " + name);
        greeter.greet("Alice");
    }
}
```

**Task:**
Change the output to say:
`"Hi <name>! Have a great day!"`
Then call it with your own name.

---

### **3. Lambda with a return value**

**Concept:** Lambdas can also return something.
If the body has one line, you can skip `return`.

**Starter code:**

```java
interface Calculator {
    int add(int a, int b);
}

public class Exercise3 {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println(add.add(5, 3));
    }
}
```

**Task:**
Change it so that it **subtracts** instead of adds.

---

### **4. Multiply two numbers**

**Concept:** You can give multiple parameters to a lambda.

**Instructions:**

1. Create an interface called `Multiplier` with one method:

   ```java
   int multiply(int a, int b);
   ```
2. In `main`, create a lambda that multiplies the two numbers and returns the result.
3. Print the result of multiplying 4 and 6.

---

### **OPTIONAL 5. Use multiple lines in a lambda**

**Concept:** If you need multiple statements, wrap them in `{}` and use `return` explicitly like in a normal method body.

**Instructions:**

1. Create an interface `SquareCalculator` with one method:

   ```java
   int square(int x);
   ```
2. The lambda should:

    * print `"Calculating square..."`
    * then return the square of `x`.

---

### **6. No parameters**

**Concept:** If the method doesn’t take parameters, use empty parentheses.

**Instructions:**

1. Create an interface `RandomPrinter` with one method:

   ```java
   void printRandom();
   ```
2. Create a lambda that prints a random number between 1 and 10.

---

### **7. Explicit vs inferred types**

**Concept:** You can specify parameter types or let Java figure them out.

**Instructions:**

1. Create an interface `Divider` with one method:

   ```java
   double divide(double a, double b);
   ```
2. First write the lambda with types: `(double a, double b) -> a / b`
3. Then remove the types and confirm it still works.

---

### **8. Reuse your lambda**

**Concept:** You can call the same lambda multiple times.

**Instructions:**

1. Create an interface `Greeter` with one method:

   ```java
   void greet(String name);
   ```
2. Make a lambda that says `"Hello, <name>!"`.
3. Call it three times with different names.

---

### **9. Lambda and local variables**

**Concept:** Lambdas can use variables from outside, if they are not changed later. Those variables have to be final, or something called effectively final. These are variables that are only given a value once but don't have the explicit final keyword.

**Instructions:**

1. Create an interface `Printer` with:

   ```java
   void print(String text);
   ```
2. Define a variable `prefix = "Message: "` before your lambda.
3. The lambda should print `prefix + text`.
4. Try to change `prefix` after defining the lambda — what happens?

---

### **10. Lambdas inside a loop**

**Concept:** You can call a lambda multiple times in a loop.

**Instructions:**

1. Create an interface `NumberChecker` with:

   ```java
   void check(int n);
   ```
2. The lambda should print whether `n` is even or odd.
3. Loop through numbers 1–5 and call the lambda each time.

---

### **11. Passing a lambda to a method (intro)**

**Concept:** A lambda can be given as an argument to a method that expects a functional interface.

**Instructions:**

1. Create interface `Action` with:

   ```java
   void run();
   ```
2. Write a method `perform(Action action)` that calls `action.run()`.
3. Pass a lambda that prints `"Running from lambda!"`.

---

### **12. Passing different lambdas**

**Concept:** You can pass different lambdas to the same method for different outcomes.

**Instructions:**

1. Use the `perform(Action action)` method from the previous exercise.
2. Pass three different lambdas:

    * One that prints `"Start!"`
    * One that prints `"Still running..."`
    * One that prints `"Done!"`

---

### **13. Lambda with input in a method**

**Concept:** The method that receives the lambda can also pass data to it.

**Instructions:**

1. Create interface `MessageHandler` with:

   ```java
   void handle(String message);
   ```
2. Write a method `sendMessage(MessageHandler handler)` that calls `handler.handle("Hello from method!")`.
3. Pass a lambda that prints the message in uppercase.

---

### **14. Lambda returning a result through a method**

**Concept:** Methods can call lambdas that return something.

**Instructions:**

1. Create interface `Operation` with:

   ```java
   int apply(int a, int b);
   ```
2. Write a method `calculate(Operation op)` that calls `op.apply(8, 2)` and prints the result.
3. Pass a lambda for addition, subtraction, and multiplication one by one.

---

### **15. Lambda used in an array loop**

**Concept:** Lambdas can help process lists or arrays.

**Instructions:**

1. Create interface `NamePrinter` with:

   ```java
   void print(String name);
   ```
2. Create an array of names and loop over it.
3. For each name, call a lambda that prints `"Name: <name>"`.

---

### **16. Return a lambda from a method**

**Concept:** Methods can *return* a lambda.

**Instructions:**

1. Create interface `MathAction` with:

   ```java
   int act(int a, int b);
   ```
2. Create a method `getAdder()` that returns a lambda adding two numbers.
3. Use it to add 3 and 7.

---

### **17. Store lambdas in variables**

**Concept:** You can store lambdas and use them later.

**Instructions:**

1. Create interface `Printer` with:

   ```java
   void print(String text);
   ```
2. Create two lambdas: one that prints normally, and one that prints in uppercase.
3. Store them in variables and call them later in the program.

---

### **18. Lambdas calling other methods**

**Concept:** A lambda can call existing methods inside it.

**Instructions:**

1. Create interface `StringAction` with:

   ```java
   void act(String text);
   ```
2. The lambda should call `text.toLowerCase()` and print the result.

---

### **19. Passing lambdas to choose behavior**

**Concept:** Passing different lambdas changes how a method behaves.

**Instructions:**

1. Create interface `Transformer` with:

   ```java
   String transform(String text);
   ```
2. Write a method `process(Transformer t, String text)` that prints `t.transform(text)`.
3. Pass different lambdas:

    * one that makes it uppercase
    * one that reverses it
    * one that adds `"!!!"` to it

---

### **20. Combine knowledge (mini challenge)**

**Concept:** You can define small reusable actions with lambdas.

**Instructions:**

1. Create interface `Filter` with:

   ```java
   boolean test(int number);
   ```
2. Write a method `filterNumbers(Filter f, int[] numbers)` that prints only the numbers where `f.test(number)` is true.
3. Pass lambdas for:

    * even numbers
    * numbers greater than 5
    * numbers divisible by 3

---
