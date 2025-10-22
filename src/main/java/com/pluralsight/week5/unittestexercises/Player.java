package com.pluralsight.week5.unittestexercises;

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // regular method
    public void addPoints(int points) {
        score += points;
    }

}
