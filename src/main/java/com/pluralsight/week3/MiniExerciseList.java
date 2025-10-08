package com.pluralsight.week3;

import java.util.ArrayList;
import java.util.List;

/*



 */
public class MiniExerciseList {
    /*
    ## List of friends
- Create a new list with 5 friends
- Add a new friend
- Remove the friend on index 2
- Loop through all the friends and print the value
     */
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();
        friends.add("Zia");
        friends.add("Louiza");
        friends.add("Noura");
        friends.add("Besma");
        friends.add("Jade");
        friends.add("Fatiha");

        friends.remove(2);

        for(String friend : friends) {
            System.out.println(friend);
        }

        /*
        ## List of numbers
        - Create a new list with 10 numbers
        - Calculate the sum of all the numbers in the list using a loop
        - Alter the values in the list by multiplying all the numbers by 2
        - Print the new values
         */

        List<Integer> numbers = new ArrayList<>(List.of(6, 2, 3, 5, 7, 2, 3, 4, 6, 8));
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        System.out.println(sum);

        for(int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }
        for(int nr : numbers) {
            System.out.println(nr);
        }
        // alternative way for printing
        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


    }
}
