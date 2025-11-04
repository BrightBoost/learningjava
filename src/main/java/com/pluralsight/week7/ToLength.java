package com.pluralsight.week7;

public class ToLength implements Mapper<String,Integer>{
    @Override
    public Integer map(String input) {
        return input.length();
    }
}
