package com.pluralsight.week7;

public class OptionalLite<T> {
    T value;
    private OptionalLite(T value) {
        this.value = value;
    }

    public static <T> OptionalLite<T> of(T value) {
        return new OptionalLite<>(value);
    }
}
