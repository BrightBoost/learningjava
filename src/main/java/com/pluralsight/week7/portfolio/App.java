package com.pluralsight.week7.portfolio;

public class App {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "234", 1500);
        // try to deposit money into both accounts
        account1.deposit(100);
        account2.getValue();
        ((BankAccount) account2).deposit(100);
    }
}
