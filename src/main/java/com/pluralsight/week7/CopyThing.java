package com.pluralsight.week7;

// a functional interface is a java interface with only ONE abstract method exactly
@FunctionalInterface
public interface CopyThing<T> {
    T copy(T thing);
}
