package com.pluralsight.week1;

public class RecapTuesday {
    public static void main(String[] args) {
        // data types: primitives and non-primitives
        // primitives are simple types and they start with lowercase
        int i = 10;
        long l = 10L;
        double d = 5.4;
        float f = 5.4f;
        short s = 100;
        byte b = 125;
        char c = 'a';
        boolean bool = false;
        // non-primitives: all other types, start with uppercase letter
        String text = "blablabla";

        // local, static and instance variables
        // only focus on local for now: variables inside a method
        // all variables above are local

        // read only variables
        final int example = 5;
//        example = 6; // you can only assign final variables a value once, this wont compile

        // string concat + mathematical operators
        String someText = "some" + text;
        double nr1 = 3.4;
        double nr2 = 1;
        double result1 = nr1 + nr2;
        double result2 = nr1 - nr2;
        double result3 = nr1 * nr2;
        double result4 = nr1 / nr2;
        double result5 = nr1 % nr2;

        // pre and post increment
        int x = 8;
        int y = x++; // y will be 8 and x will be 9 afterwards

        int x1 = 8;
        int y1 = ++x; // y1 will be 9 and x1 will be 9

        int result = x++ + ++y1 * x++;
        System.out.println(result);

        // literals = hard coded values
        int something = 7; // 7 is a literal
        // literals have a certain type

        // widening = when we assign a smaller type to a bigger type
        long someLong = something; // int to long
        double someDouble = 4.5f; // float to double

        // narrowing and type casting
        // when you try to assign some type that could have a value that's too big to a smaller type
        something = (int) someLong; // long to int
        float someFloat = (float) someDouble; // double to float

        // Math
        double nr3 = 6.5;
        System.out.println(Math.round(nr3));
        System.out.println(Math.ceil(nr3));
        System.out.println(Math.floor(nr3));
        System.out.println(nr3);

        nr3 = Math.round(nr3);
        System.out.println(nr3);

        double randomValue = Math.random(); // number between 0 and 1
        System.out.println(randomValue);

        // let's generate a random int between 0 and 50
        int randomNr = (int) Math.round(* 50);

    }
}
