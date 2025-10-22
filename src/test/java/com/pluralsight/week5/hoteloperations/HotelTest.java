package com.pluralsight.week5.hoteloperations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    private Hotel hotel;

    // runs before every test
    // so every test has its own hotel object
    @BeforeEach
    void init() {
        hotel = new Hotel("bla", 50, 50, 25, 30);
    }

    @Test
    void getAvailableSuites() {
        // arrange
        int expectAvailableSuites = 25;

        // act
        int availableSuites = hotel.getAvailableSuites();

        // assert
        assertEquals(expectAvailableSuites, availableSuites);
    }

    @Test
    void getAvailableBasicRooms() {
        // arrange
        int expectAvailableBasicRooms = 20;

        // act
        int availableBasicRooms = hotel.getAvailableBasicRooms();

        // assert
        assertEquals(expectAvailableBasicRooms, availableBasicRooms);
    }

    @Test
    void bookBasicRoom_enoughSpace() {
        // arrange
        int roomsToBook = 5;
        int expectedRoomsLeft = 15;

        // act
        boolean succeeded = hotel.bookRoom(5, false);

        // assert
        int roomsLeft = hotel.getAvailableBasicRooms();
        assertTrue(succeeded);
        assertEquals(expectedRoomsLeft, roomsLeft);
    }

    @Test
    void bookBasicRoom_notEnoughSpace() {
        // arrange

        // act

        // assert
    }

    @Test
    void bookSuiteRoom_enoughSpace() {
        // arrange
        Hotel hotel = new Hotel("bla", 50, 50, 25, 30);

        // act

        // assert
    }

    @Test
    void bookSuiteRoom_notEnoughSpace() {
        // arrange
        Hotel hotel = new Hotel("bla", 50, 50, 25, 30);

        // act

        // assert
    }
}