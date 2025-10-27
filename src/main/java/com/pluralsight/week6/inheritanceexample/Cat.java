package com.pluralsight.week6.inheritanceexample;

public class Cat extends Animal {

    private int nrOfLivesLeft;

    public int getNrOfLivesLeft() {
        return nrOfLivesLeft;
    }

    public void setNrOfLivesLeft(int nrOfLivesLeft) {
        this.nrOfLivesLeft = nrOfLivesLeft;
    }

    public void meow() {
        System.out.println(getName() + " says: MEOW");
    }

}
