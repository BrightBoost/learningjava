package com.pluralsight.week7;

public class ToString implements Mapper<Double,String> {
    @Override
    public String map(Double input) {
        return "" + input;
    }
}
