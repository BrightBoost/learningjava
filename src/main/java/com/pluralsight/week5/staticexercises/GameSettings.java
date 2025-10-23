package com.pluralsight.week5.staticexercises;

public class GameSettings {
    public static int volumeLevel = 5;

    public void changeVolumeLevel(int newLevel) {
        volumeLevel = newLevel;
    }

    public void printLevel() {
        System.out.println(volumeLevel);
    }
}
