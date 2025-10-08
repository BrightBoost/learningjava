package com.pluralsight.week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PopulateMapFromFile {
    public static void main(String[] args) {
        Map<String, String> translations = new HashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("files/mapExample.txt"));
            String translation;
            while((translation = bufferedReader.readLine()) != null) {
                String[] translationArr = translation.split("=");
                translations.put(translationArr[0], translationArr[1]);
            }
            bufferedReader.close();
            System.out.println(translations);

        } catch (IOException e)  {
            System.out.println(e.getMessage());
        }
    }
}
