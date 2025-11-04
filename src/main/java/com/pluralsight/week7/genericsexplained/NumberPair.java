package com.pluralsight.week7.genericsexplained;

public class NumberPair<T extends Number> {
    private T leftThing;
    private T rightThing;
    public NumberPair(T leftThing, T rightThing) {
        this.leftThing = leftThing;
        this.rightThing = rightThing;
    }
    public T getLeftThing() {
        return this.leftThing;
    }
    public T getRightThing() {
        return this.rightThing;
    }
    public void swap() {
        T temp = leftThing;
        rightThing = leftThing;
        leftThing = rightThing;
    }
}
