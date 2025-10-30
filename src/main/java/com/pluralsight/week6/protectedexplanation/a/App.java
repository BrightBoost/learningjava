package com.pluralsight.week6.protectedexplanation.a;

import com.pluralsight.week6.protectedexplanation.b.CinB;

public class App {
    public static void main(String[] args) {
        AinA a1 = new AinA();
        a1.w = 7;

        AinA a2 = new AinA();
        a2.w = 12;

        CinB c1 = new CinB();
        c1.w = 21;
    }
}
