package com.pluralsight.week2.theaterreservationoop;

import java.time.LocalDate;

public class Reservation {
    private String name;
    private LocalDate date;
    private int nrOfTickets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNrOfTickets() {
        return nrOfTickets;
    }

    public void setNrOfTickets(int nrOfTickets) {
        this.nrOfTickets = nrOfTickets;
    }

    public void displayReservation() {
        System.out.printf("%d %s reserved for %s under %s", nrOfTickets, nrOfTickets > 1 ? "tickets" : "ticket", date, name);
    }
}
