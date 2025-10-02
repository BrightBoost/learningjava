package com.pluralsight.week2.theaterreservationoop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Reservation reservation = getReservation();
        displayReservation(reservation);
    }

    public static Reservation getReservation() {
        Reservation reservation = new Reservation();
        // fullname
        System.out.println("What is your full name?");
        reservation.setName(scanner.nextLine());

        // date + parse
        System.out.println("What date will you be coming? (MM/dd/yyyy)");
        String strDate = scanner.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        reservation.setDate(LocalDate.parse(strDate, dtf));

        // nr of tickets
        System.out.println("How many tickets would you like?");
        reservation.setNrOfTickets(scanner.nextInt());
        scanner.nextLine();

        return reservation;
    }

    public static void displayReservation(Reservation reservation) {
        System.out.printf("%d %s reserved for %s under %s", reservation.getNrOfTickets(), reservation.getNrOfTickets() > 1 ? "tickets" : "ticket", reservation.getDate(), reservation.getName());
    }
}
