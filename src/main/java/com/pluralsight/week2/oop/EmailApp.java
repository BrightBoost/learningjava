package com.pluralsight.week2.oop;

import java.time.LocalDate;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email();
        email.setSender("Maaike");
        email.setReceiver("Emmanuel");
        email.setMessage("Keep it up!");
        email.setSendingDate(LocalDate.now());

        email.displayEmailInfo();

        Email email2 = new Email("Emmanuel", "Maaike", "I will.", LocalDate.now());
        email2.displayEmailInfo();
    }
}
