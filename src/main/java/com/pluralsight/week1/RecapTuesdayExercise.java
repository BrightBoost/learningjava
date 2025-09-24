package com.pluralsight.week1;

public class RecapTuesdayExercise {
    public static void main(String[] args) {
        /*
        ### 🔹 Challenge A: Double Trouble
        * Create an `double` with any value you like.
        * Multiply it by 2.
        * Print both the original and the doubled value.
        */
        double doubleValue = 5.1;
        double doubleDoubleValue = doubleValue * 2;
        System.out.println("Original: " + doubleValue);
        System.out.println("Doubled value: " + doubleDoubleValue);

        /*

        ### 🔹 Challenge B: Name + Number
        * Make a `String` with your name.
        * Make an `int` with your favorite number.
        * Print them in one sentence using concatenation.
        */
        String name = "Maaike";
        int favoriteNumber = 1;
        System.out.println(name + "'s favorite number is " + favoriteNumber + ".");

       /*

        ### 🔹 Challenge C: Random Surprise
        * Generate a random number between 0 and 10.
        * Print it.
        * Add 5 to it and print the new value.
        */
        int randomNumber = (int) Math.round(Math.random() * 10);
        System.out.println(randomNumber);
        randomNumber = randomNumber + 5;
        System.out.println(randomNumber);

        /*
        ### 🔹 Bonus 1: Clock Math ⏰
        */
        int hour = 29;
        int hourIn24Clock = 29 % 24;

        /*

        ### 🔹 Bonus 2: Minutes to Hours and Minutes ⏳

        Take a number of minutes (e.g. `130`) and figure out how many full hours and leftover minutes that is.

        * Hours = `minutes / 60`
        * Leftover = `minutes % 60`

        Example:

        ```
        130 minutes = 2 hours and 10 minutes
        ```

        */
        int totalMinutes = 183;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(totalMinutes + " minutes = " + hours + " hours and " + minutes + " minutes");
        /*

        ### 🔹 Bonus 3: Time Calculator 📅
        */
        int startingHours = 3;
        int startingMinutes = 59;
        int minutesToAdd = 183;

        int newHours = (minutesToAdd + startingMinutes) / 60 + startingHours;
        int newMinutes = (minutesToAdd + startingMinutes) % 60;
        System.out.println("The new time will be " + newHours + ":" + newMinutes);

        /*
        ---

        ## 📝 Exercise: Time Calculator (No `if` statements)

        You are given a starting time and some extra minutes to add. Write a program that calculates the final time on a 24-hour clock.

        ### Step 1: Start with variables

        ```java
        int nrHours = 3;
        int nrMinutes = 23;
        int minutesToAdd = 183;
        ```


        ---

        ### Step 2: Find the new hours

        ---

        ### Step 3: Find the leftover minutes

        ---

        ### Step 4: Print the final time

        Finally, show the result as `hours:minutes`.

        ```java
        System.out.println("Final time: " + newHours + ":" + newMinutes);
        ```

        ---

        ### ✅ Example Run

        ```
        Start time: 3:23
        Minutes to add: 183
        Final time: 6:26
        ```

        ---



         */
    }
}
