package com.pluralsight.week5.staticexercises;

public class PlayerApp {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();

        p1.getGameSettings().changeVolumeLevel(10);
        p2.getGameSettings().printLevel();
    }
}
