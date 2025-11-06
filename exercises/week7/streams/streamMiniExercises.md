## Exercise 1

1. Create a class named StreamExample with a main method.
2. In the main method, create a List of integers.
3. Use the stream API to filter out even numbers
4. Bonus: Next, square each remaining number. (map)
5. Use collect to get the results in a new list or use toList() if you have a new enough version of Java.


## Exercise 2
1. Create a class named TerminalOperationsExample with a main method.
2. In the main method, create a List of integers.
3. Use the stream API to count the number of even numbers in the list.


## Exercise 3
1. Create a class named IntermediateOperationsExample with a main method.
2. In the main method, create a List of strings.
3. Use the stream API to filter out strings with fewer than 6 characters, convert them to uppercase, and collect the results in a new list.


## Exercise 4

Rewrite a for loop that prints each string in a list using the forEach method.
Steps:

- Create a class named LoopToForEachExample with a main method.
- In the main method, create a List of strings.
- Consider the following for loop:
```
for (String s : strings) {
  System.out.println(s);
}
```

Replace the for loop with the forEach method and a lambda expression.
