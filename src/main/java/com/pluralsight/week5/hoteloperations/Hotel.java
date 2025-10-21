package com.pluralsight.week5.hoteloperations;

public class Hotel {
    private String name;
    private int numberOfSuites; // king suites
    private int numberOfRooms; // basic double
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableBasicRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    // regular methods
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if(isSuite && numberOfRooms < getAvailableSuites()) {
            bookedSuites += numberOfRooms;
            return true;
        } else if(!isSuite && numberOfRooms < getAvailableBasicRooms()) {
            bookedBasicRooms += numberOfRooms;
            return true;
        }
        return false;
    }
}
