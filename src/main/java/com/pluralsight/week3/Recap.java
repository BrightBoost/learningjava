package com.pluralsight.week3;

public class Recap {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = x + y * x;
        String s = "blabla";
        Integer x2 = 5;
        String go = "valid";

        if(s.equals(go)) {
            System.out.println("same strong");
        } else if(s.equalsIgnoreCase(go)) {
            System.out.println("same if we ignore casing");
        }

        double[] doubles ={1.2, 6.7, 2.3};

        for(double d : doubles) {
            if(d < 1.0) {
                continue;
            } else if(d == 6.7) {
                break;
            }
            System.out.println(d);

        }

        double[] doubles1 = new double[10]; // what are the values in this array? --> 0.0

    }
}
