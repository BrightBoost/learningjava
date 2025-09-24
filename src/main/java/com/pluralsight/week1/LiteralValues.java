package com.pluralsight.week1;

public class LiteralValues {
    public static void main(String[] args) {
        int i = 101;
        long j = 123_456_789_012L;
        long newLong = 123;
        double d = 5.56;
        float f = 5.56f;

        long nr = 123L;
        int otherNr = (int) nr; // casting from long to int
        System.out.println(otherNr);

    }
}
