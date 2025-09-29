## Step 1 - Creating a new project in IntelliJ

Solution:

1. Open IntelliJ and select "Create New Project"
2. Choose "Java" from the list of options and click "Next"
3. Give your project a name (e.g. "Reinforcement-lab") and choose a location to save it.
4. Click "Finish" to create the project.

## Step 2 - Adding a new class

Solution:

1. In the project view, right-click on the package where you want to create the new class.
2. Select "New" -> "Java Class"
3. Enter "MyApplication" as the class name and click "OK".

## Step 3 - Creating variables

Solution:

1. In the `MyApplication` class, add the following code:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your name:");
String name = scanner.nextLine();

System.out.println("Enter your age:");
int age = scanner.nextInt();

System.out.println("Name: " + name);
System.out.println("Age: " + age);
```

## Step 4 - Using the scanner with if statements

Solution:

1. Modify the existing code in `MyApplication` to include the following if statement:

```java
if(age >= 18) {
    System.out.println("You are old enough to vote.");
} else {
    System.out.println("You are not old enough to vote.");
}
```

## Step 5 - Declaring methods and calling them

Solution:

1. Add the following method to `MyApplication`:

```java
public static void printMessage(String name, int age) {
    System.out.println("Hello, " + name + "! You are " + age + " years old.");
}
```

2. Call the `printMessage` method from the main method:

```java
printMessage(name, age);
```

## Step 6 - Dividing the code into chunks of methods

Solution:

1. Identify parts of the code that perform distinct tasks, such as getting user input or printing out messages.
2. Refactor the code by moving these tasks into separate methods.

For example, you could create methods like `getName`, `getAge`, and `printInfo`, and call them from the main method.

```java
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = getName(scanner);
        int age = getAge(scanner);

        System.out.println("=============================================");
        printNameAndAge(name, age);
        System.out.println("=============================================");
        printVotingEligibility(age);
        System.out.println("=============================================");
        printMessage(name, age);
    }

    public static String getName(Scanner scanner) {
        System.out.println("Enter your name:");
        return scanner.nextLine();
    }

    public static int getAge(Scanner scanner) {
        System.out.println("Enter your age:");
        return scanner.nextInt();
    }

    public static void printNameAndAge(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void printVotingEligibility(int age) {
        if(age >= 18) {
            System.out.println("You are old enough to vote.");
        } else {
            System.out.println("You are not old enough to vote.");
        }
    }

    public static void printMessage(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}

```

## Step 7 - Comparing Strings

Solution:

1. Add the following method to your `MyApplication` class:

```java
public static void printWelcomeMessage(String name) {
    if(name.equalsIgnoreCase("Alice")) {
        System.out.println("Welcome, Alice!");
    } else {
        System.out.println("Hello, stranger!");
    }
}
```

2. Call this method from the `main` method:

```java
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = getName(scanner);
        int age = getAge(scanner);

        System.out.println("=============================================");
        printNameAndAge(name, age);
        System.out.println("=============================================");
        printVotingEligibility(age);
        System.out.println("=============================================");
        printMessage(name, age);
        System.out.println("=============================================");
        printWelcomeMessage(name);
    }

// The rest of the methods are below
}
```

## Step 8 - Using if statement with logical operators

Solution:

1. Add the following method to your `MyApplication` class:

```java
public static void printDrinkingEligibility(String name, int age) {
    if(name.equalsIgnoreCase("Bob") && age >= 21) {
        System.out.println("You are old enough to drink.");
    } else {
        System.out.println("You are not old enough to drink.");
    }
}
```

2. Call this method from the `main` method:

```java
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = getName(scanner);
        int age = getAge(scanner);

        System.out.println("=============================================");
        printNameAndAge(name, age);
        System.out.println("=============================================");
        printVotingEligibility(age);
        System.out.println("=============================================");
        printMessage(name, age);
        System.out.println("=============================================");
        printWelcomeMessage(name);
        System.out.println("=============================================");
        printDrinkingEligibility(name, age);
        System.out.println("=============================================");
    }

// The rest of the methods are below
}
```

## Step 9 - Using the Math library

Solution:

1. Add the following methods to `MyApplication`:

```java
public static double getNumber(Scanner scanner) {
    System.out.println("Enter a number:");
    return scanner.nextDouble();
}

public static double calculateSquareRoot(double number) {
    return Math.sqrt(number);
}
```

2. Call this method from the `main` method and print out the result:

```java
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = getName(scanner);
        int age = getAge(scanner);

        System.out.println("=============================================");
        printNameAndAge(name, age);
        System.out.println("=============================================");
        printVotingEligibility(age);
        System.out.println("=============================================");
        printMessage(name, age);
        System.out.println("=============================================");
        printWelcomeMessage(name);
        System.out.println("=============================================");
        printDrinkingEligibility(name, age);
        System.out.println("=============================================");

        double number = getNumber(scanner);
        double squareRoot = calculateSquareRoot(number);
        System.out.println("The square root of " + number + " is " + squareRoot);
        System.out.println("=============================================");
    }

// The rest of the methods are below

}
```

## Step 10 - Using a switch statement

Solution:

1. To add the switch statement based on the user's name, you can modify the `printWelcomeMessage` method like this:

```java
public static void printWelcomeMessage(String name) {
    switch (name.toLowerCase()) {
        case "alice":
            System.out.println("Welcome, Alice!");
            break;
        case "bob":
            System.out.println("Hey Bob, do you want to grab a drink?");
            break;
        default:
            System.out.println("Hello, stranger!");
            break;
    }
}
```

## Step 11 - Using boolean variables

Solution:

1. Add the following methods to `MyApplication`:

```java
public static int getFirstNumber(Scanner scanner) {
    System.out.println("Enter the first number:");
    return scanner.nextInt();
}

public static int getSecondNumber(Scanner scanner) {
    System.out.println("Enter the second number:");
    return scanner.nextInt();
}

public static boolean isGreaterThan(int firstNumber, int secondNumber) {
    return firstNumber > secondNumber;
}
```

2. Call these methods from the `main` method and print out the result:

```java
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = getName(scanner);
        int age = getAge(scanner);

        System.out.println("=============================================");
        printNameAndAge(name, age);
        System.out.println("=============================================");
        printVotingEligibility(age);
        System.out.println("=============================================");
        printMessage(name, age);
        System.out.println("=============================================");
        printWelcomeMessage(name);
        System.out.println("=============================================");
        printDrinkingEligibility(name, age);
        System.out.println("=============================================");

        double number = getNumber(scanner);
        double squareRoot = calculateSquareRoot(number);
        System.out.println("The square root of " + number + " is " + squareRoot);
        System.out.println("=============================================");

        int firstNumber = getFirstNumber(scanner);
        int secondNumber = getSecondNumber(scanner);
        boolean isGreaterThan = isGreaterThan(firstNumber, secondNumber);
        System.out.println(firstNumber + " is greater than " + secondNumber + ": " + isGreaterThan);
    }
// The rest of the methods are below

}
```

## Step 12 - Using the ternary operator

Solution:

1. Add the ternary operator in the main method:

```java
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = getName(scanner);
        int age = getAge(scanner);

        System.out.println("=============================================");
        printNameAndAge(name, age);
        System.out.println("=============================================");
        printVotingEligibility(age);
        System.out.println("=============================================");
        printMessage(name, age);
        System.out.println("=============================================");
        printWelcomeMessage(name);
        System.out.println("=============================================");
        printDrinkingEligibility(name, age);
        System.out.println("=============================================");

        double number = getNumber(scanner);
        double squareRoot = calculateSquareRoot(number);
        System.out.println("The square root of " + number + " is " + squareRoot);
        System.out.println("=============================================");

        int firstNumber = getFirstNumber(scanner);
        int secondNumber = getSecondNumber(scanner);
        boolean isGreaterThan = isGreaterThan(firstNumber, secondNumber);
        System.out.println(firstNumber + " is greater than " + secondNumber + ": " + isGreaterThan);

        String welcomeMessage = name.equals("Lara") ? "You are not welcome, " + name + "!" : "Welcome, " + name + "!";
        System.out.println(welcomeMessage);
        System.out.println("=============================================");
    }
// The rest of the methods are below

}
```

## Step 13 - Using the Math library (part 2)

Solution:

1. Create a new method called `getMax` in your `MyApplication` class that takes two `double` numbers as input and returns the larger of the two. The method signature should look like this:

```java
public static double getMax(double num1, double num2) {
    // implementation
}
```

2. Inside the `getMax` method, use the `Math.max` function to find the maximum of the two numbers. The implementation should look like this:

```java
public static double getMax(double num1, double num2) {
    return Math.max(num1, num2);
}
```

3. Call the `getMax` method from your `main` method, passing in two numbers, and print out the result. The implementation should look like this:

```java
double num1 = 5.6;
double num2 = 3.2;
double maxNum = getMax(num1, num2);
System.out.println("The maximum of " + num1 + " and " + num2 + " is " + maxNum);
```

## Step 14 - Creating a Random Number Generator

Solution:

1. Add the following method to `MyApplication`:

```java
public static int generateRandomNumber() {
    int min = 1;
    int max = 10;
    return (int)(Math.random() * ((max - min) + 1)) + min;
}
```

This method uses the `Math.random()` function to generate a random double between 0.0 and 1.0, which is then multiplied by the range of numbers we want (max - min + 1) and then added to the minimum value to get a random integer between the specified range. In this case, we want a random integer between 1 and 10.

Here is a breakdown of the code used in the `generateRandomNumber()` method:

- `int min = 1;` : This sets the minimum value of the range to 1.

- `int max = 10;` : This sets the maximum value of the range to 10.

- `return (int)(Math.random() \* ((max - min) + 1)) + min;` : This generates a random integer between 1 and 10 (inclusive). Let's break it down further:

  - `(max - min) + 1` calculates the range of the random numbers. In this case, it is 10 - 1 + 1 = 10.

  - `Math.random()` generates a random decimal number between 0 and 1 (exclusive).

  - `(int)(Math.random() \* ((max - min) + 1))` scales the random decimal number to the desired range of random integers, in this case between 0 and 10.

  - `+ min` shifts the range of random integers to start from 1, rather than 0.

So, in summary, the formula behind the `generateRandomNumber()` method generates a random integer within a specified range by scaling a randomly generated decimal number and then shifting the range to start at a specific minimum value.

2. Call the `generateRandomNumber` method from the main method, printing out the result:

```java
int randomNum = generateRandomNumber();
System.out.println("Random number between 1 and 10: " + randomNum);
```

This code calls the `generateRandomNumber()` method we just created and assigns the result to the variable `randomNum`. Then, it prints out the random number using `System.out.println()`.

## Step 15 - Using the Math library (part 3)

Solution:

1. Add the following method to `MyApplication`:

```java
public static int getSmallerNumber(int firstNumber, int secondNumber) {
    return Math.min(firstNumber, secondNumber);
}
```

2. Call the `getSmallerNumber` method from the main method, passing in two numbers and printing out the result:

```java
int number1 = 5;
int number2 = 10;
int smallerNumber = getSmallerNumber(number1, number2);
System.out.println("The smaller number is: " + smallerNumber);
```

Of course, you can replace the number1 and number2 variables with any other integers you like.

## Step 16 - Uploading the code to GitHub

Solution:

1. Open Git Bash and navigate to your project folder.
2. Type git init to initialize a new Git repository.
3. Type git add . to add all files to the staging area.
4. Type git commit -m "Initial commit" to commit the changes with a message.
5. Go to GitHub and create a new repository.
6. Copy the repository URL.
7. Type git remote add origin <repository URL> to set the remote repository.
8. Type git push origin master to push the changes to the remote repository.

This will upload your code to a new repository on GitHub, which can be accessed and managed through the GitHub website. Be sure to replace <repository URL> with the actual URL of your new repository.
