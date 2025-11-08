package com.pluralsight.week7.exampletestscanner;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ScannerExampleTest {
    @Test
    void readsValidOnFirstTry() {
        var input = new ByteArrayInputStream("6\n".getBytes(StandardCharsets.UTF_8));
        var scanner = new Scanner(input);
        var output = new ByteArrayOutputStream();
        var out = new PrintStream(output);

        int result = ScannerExample.readIntBetween(scanner, out, 1, 10);

        assertEquals(6, result);
        String text = output.toString(StandardCharsets.UTF_8);
        assertTrue(text.contains("Enter a number between 1 and 10"));
    }

    @Test
    void repromptsOnBadInputThenSucceeds() {
        var inputData = "abc\n-1\n6\n"; // bad, out of range, ok
        var input = new ByteArrayInputStream(inputData.getBytes(StandardCharsets.UTF_8));
        var scanner = new Scanner(input);
        var output = new ByteArrayOutputStream();
        var out = new PrintStream(output);

        int result = ScannerExample.readIntBetween(scanner, out, 1, 10);

        assertEquals(6, result);
    }

}