package com.pluralsight.week1;

public class Operators {
    public static void main(String[] args) {
        // example of intentional integer division
        int nrEggs = 150;
        int eggsPerBox = 12;
        int totalBoxes = nrEggs / eggsPerBox;
        System.out.println("We'll have this many boxes of eggs: " + totalBoxes);

        // simple multiplication
        int eggsInBoxes = eggsPerBox * totalBoxes;
        System.out.println("We have this many eggs in boxes: " + eggsInBoxes);

        // eggs not in boxes
        int eggsLeft = nrEggs - eggsInBoxes;
        System.out.println("This many eggs are not in a box " + eggsLeft);

        // eggs not in boxes, different way to calculate
        int eggsLeft2 =  nrEggs % eggsPerBox;
        System.out.println("This many eggs are not in a box " + eggsLeft2);

        System.out.println("********************");
        int y = 4;
        y = y + 1;
        System.out.println(y);
        // shorter way to write + 1
        y++;
        System.out.println(y);
        System.out.println(y + 1); // showing 1 higher than y, not altering y
        System.out.println(y++); // alter y after printing - post increment
        // post increment means first pass in the value, then increment
        System.out.println(y); // y is now 7
        System.out.println(++y); // pre increment, first increment, then pass in the value

        System.out.println("******* fun games ******");
        int x = 5;
        int k = 6;
        int z = 2;

        int result = x++ + ++k * z++;
        System.out.println(result);
        result = ++z * ++k - z++;
        System.out.println(result);

        int nr1 = 2;
        int nr2 = 5;
        int nr3 = 2;

        int newResult = nr1++ + ++nr2 / nr1++;
        System.out.println(newResult);

        int example = 2;
        System.out.println(++example);
        System.out.println(example);

        // normal division
        double d1 = 9.6;
        double d2 = 3.0;
        System.out.println(d1 / d2);

        System.out.println("******");
        int p = 7;
        System.out.println(p++ + p++ + ++p);

        int something = 4;
        something += 6; // something = something + 6
        System.out.println(something);

        int n = 10;
        n += n++ + ++n;
        System.out.println(n);

        int lvl = 1;
        lvl = lvl++ + ++lvl + lvl;
        System.out.println(lvl);

    }
}
