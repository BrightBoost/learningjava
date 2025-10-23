package com.pluralsight.week5.staticexercises;

public class Player {
    private String name;
    private GameSettings gameSettings = new GameSettings();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameSettings getGameSettings() {
        return gameSettings;
    }

    public void setGameSettings(GameSettings gameSettings) {
        this.gameSettings = gameSettings;
    }
}
