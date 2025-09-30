package com.pluralsight.week2;

public class SomeRandomCode {
    public static void main(String[] args) {
        long y = Integer.MAX_VALUE;
        System.out.println(y);
        y = y + 1;
        System.out.println(y);
        int x = (int) y; // cast << narrowing
        System.out.println(x);
        System.out.println(Integer.MIN_VALUE);

        // widening
        int nr1 = 6;
        long nr2 = nr1;

        String str = String.valueOf(nr2);
        System.out.println(str);

        String strNr = "8";
        int intNr = Integer.parseInt(strNr);
        System.out.println(intNr);
    }
}
