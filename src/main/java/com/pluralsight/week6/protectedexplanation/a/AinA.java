package com.pluralsight.week6.protectedexplanation.a;

public class AinA {
    // only accessible in this class
    private int x;
    // accessible everywhere
    public int y;
    // only accessible inside package com.pluralsight.week6.protectedexplanation.a
    int z;
    // accessible inside package com.pluralsight.week6.protectedexplanation.a AND in child classes
    protected int w;
}
