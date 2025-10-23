package com.pluralsight.week5.staticexercises;

public class MathApp {
    public static void main(String[] args) {
        int result = MathHelper.add(1, 2);
        MathHelper mh = new MathHelper();
        mh.add(1, 2); // it's not a good practice to call static members from an instance
    }
}
