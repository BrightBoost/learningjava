package com.pluralsight.week2.oop;

import java.time.LocalDate;

public class Email {
    private String sender;
    private String receiver;
    private String message;
    private LocalDate sendingDate;

    public Email() {

    }

    public Email(String sender, String receiver, String message, LocalDate sendingDate) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.sendingDate = sendingDate;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(LocalDate sendingDate) {
        this.sendingDate = sendingDate;
    }

    public void displayEmailInfo() {
        System.out.printf("%s sends %s this message on %s: %s\n", sender, receiver, sendingDate, message);
    }
}
