package com.pluralsight.week2.oop;

public class Main {
    public static void main(String[] args) {
        CellPhone cp = new CellPhone(123, "iphone", "tmobile", "234234234", "maaike");
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.print(6);
        methodOverloading.print("hello there");
        methodOverloading.print(8.2);
        methodOverloading.print(cp);
        methodOverloading.print(cp.getOwner().toUpperCase());
    }
}
