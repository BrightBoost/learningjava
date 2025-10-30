package com.pluralsight.week6.protectedexplanation.b;

import com.pluralsight.week6.protectedexplanation.a.AinA;

public class CinB extends AinA {
    public static void main(String[] args) {
        AinA ainA = new AinA();
        // ainA.w; // not accessible on other objects
    }
    public void blabla() {
        // in this class, I can only access its own w
        System.out.println(w);
    }
}
