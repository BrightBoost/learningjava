## Exercise 1: Functional Interface

Create a functional interface named `NumericOperator` that represents an operation on two integers.

Steps:
- Create a functional interface named `NumericOperator`.
- Define a method named `operate` that takes two int parameters and returns an int.
- Annotate the interface with the special annotation for functional interfaces.

## Exercise 2: Lambda Expression

Implement the NumericOperator interface using a lambda expression to perform addition.

Steps:
- In a class named `LambdaExample` with a `main` method, create a lambda expression that implements the NumericOperator interface.
- Use the lambda expression to perform addition on two integers.

## Exercise 3: Lambda Expression for Comparison

Implement the NumericOperator interface using a lambda expression to find the maximum of two integers.

Steps:
- In the LambdaExample class, create another lambda expression that implements the NumericOperator interface.
- Use the lambda expression to find the maximum of two integers.

## Exercise 4: Another Functional Interface

Create a functional interface named `StringFormatter` that represents a formatting operation on a string.

Steps:
- Create a functional interface named `StringFormatter`.
- Define a method named `format` that takes a `String` parameter and returns a `String`.

## Exercise 5: Implementing the StringFormatter Interface
Implement the `StringFormatter` interface using a lambda expression to convert a string to uppercase.

Steps:
- In the `LambdaExample` class, create a lambda expression that implements the `StringFormatter` interface.
- Use the lambda expression to convert a string to uppercase.


## Exercise 6: Functional Interface for Unary Operation

Create a functional interface named `UnaryOperator` that represents an operation on a single integer.

**Steps:**
- Create a functional interface named `UnaryOperator`.
- Define a method named `apply` that takes an `int` parameter and returns an `int`.
- Annotate the interface with the appropriate annotation for functional interfaces.


## Exercise 7: Lambda Expression to Compute Square

Implement the `UnaryOperator` interface using a lambda expression to compute the square of an integer.

**Steps:**
- In a class named `LambdaDemo` with a `main` method, create a lambda expression that implements the `UnaryOperator` interface.
- Use the lambda expression to compute and print the square of an integer.


## Exercise 8: Functional Interface with Multiple Parameters

Create a functional interface named `TriFunction` that represents a function taking three integers and returning a double.

**Steps:**
- Create a functional interface named `TriFunction`.
- Define a method named `apply` that takes three `int` parameters and returns a `double`.
- Annotate the interface with the appropriate annotation.


## Exercise 9: Lambda Expression to Compute Average

Implement the `TriFunction` interface using a lambda expression to compute the average of three integers.

**Steps:**
- In the `LambdaDemo` class, create a lambda expression that implements the `TriFunction` interface.
- Use the lambda expression to compute and print the average of three integers.


## Exercise 10: Functional Interface Returning Void

Create a functional interface named `Printer` that represents an operation that takes a string and returns no result.

**Steps:**
- Create a functional interface named `Printer`.
- Define a method named `print` that takes a `String` parameter and returns `void`.
- Annotate the interface with the appropriate annotation.


## Exercise 11: Lambda Expression to Print String

Implement the `Printer` interface using a lambda expression to print a string to the console.

**Steps:**
- In the `LambdaDemo` class, create a lambda expression that implements the `Printer` interface.
- Use the lambda expression to print a string to the console.


## Challenge: Exercise 12: Functional Interface with Generic Type

Create a generic functional interface named `Predicate<T>` that tests an object of type `T`.

**Steps:**
- Create a generic functional interface named `Predicate<T>`.
- Define a method named `test` that takes an object of type `T` and returns a `boolean`.
- Annotate the interface with the appropriate annotation.


## Exercise 13: Lambda Expression Using Generic Interface

Implement the `Predicate<String>` interface using a lambda expression to test if a string is empty.

**Steps:**
- In the `LambdaDemo` class, create a lambda expression that implements the `Predicate<String>` interface.
- Use the lambda expression to test if a string is empty and print the result.


## Exercise 14: Passing Lambda Expression to a Method

Write a method named `processStrings` that takes a `Predicate<String>` and a list of strings, and prints the strings that satisfy the predicate.

**Steps:**
- In the `LambdaDemo` class, write a method named `processStrings` that takes a `Predicate<String>` and a `List<String>`.
- Use the method to iterate over the list and print strings that satisfy the predicate.
- In the `main` method, pass a lambda expression to `processStrings` that tests if a string starts with a specific letter.

--- 
## maybe not do this CHALLENGE yet: Exercise 15: Using Built-in Functional Interfaces

Use the built-in `Consumer<Integer>` functional interface to print each element in a list of integers. Before using it, you can have a look at the implementation by ctrl + click on the Consumer word. (cmd + click for mac)

**Steps:**
- In the `LambdaDemo` class, create a list of integers.
- Use the `forEach` method and a lambda expression to print each element.
- Use a method reference as an alternative to the lambda expression.


