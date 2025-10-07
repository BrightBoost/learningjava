package com.pluralsight.week3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        try {
            // create a FileWriter (in append mode)
            FileWriter fileWriter = new FileWriter("text.txt", true);
            // create a BufferedWriter
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
            // write to the file
            String text;
            for(int i = 1; i <= 10; i++) {
                text = String.format("Counting lala %d\n", i);
                bufWriter.write(text);
            }
            // close the writer
            bufWriter.close();
        }
        catch (IOException e) {
            System.out.println("ERROR: An unexpected error occurred");
            e.getStackTrace();
        }
    }
}
