package com.pluralsight.week5.hoteloperations;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Vice's hotel", 100,100);
        hotel.bookRoom(30, true);
        System.out.println(hotel);
        hotel.bookRoom(75, false);
        System.out.println(hotel);
        hotel.bookRoom(75, false);
        System.out.println(hotel);

    }
}
