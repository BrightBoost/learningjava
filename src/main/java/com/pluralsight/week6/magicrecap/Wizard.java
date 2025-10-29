package com.pluralsight.week6.magicrecap;

public class Wizard {
    private String name;
    private String house;
    private int powerLevel;
    private String wandType;
    private Wand wand;

    public Wizard(String name, String house, int powerLevel, String wandType) {
        this.name = name;
        this.house = house;
        this.powerLevel = powerLevel;
        this.wandType = wandType;
    }

    public Wizard(String name, String house, int powerLevel, String wandType, Wand wand) {
        this.name = name;
        this.house = house;
        this.powerLevel = powerLevel;
        this.wandType = wandType;
        this.wand = wand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public String castSpell(String spell) {
        String text = name + " from " + house + " casts " + spell;
        System.out.println(text);
        return text;
    }
}
