package com.pluralsight.week2.oop;

public class MethodOverloading {

    public void print(int x) {
        System.out.println("integer: " + x);
    }

    public void print(String s) {
        System.out.println("text: " + s);
    }

    public void print(double d) {
        System.out.println("double: " + d);
    }

    public void print(CellPhone cp) {
        System.out.println("cellphone with nr: " + cp.getPhoneNumber());
    }
}
