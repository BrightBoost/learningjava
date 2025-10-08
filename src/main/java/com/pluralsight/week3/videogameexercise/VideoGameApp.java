package com.pluralsight.week3.videogameexercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VideoGameApp {
    public static void main(String[] args) {

    }

    public static List<VideoGame> readCsvFile() {
        List<VideoGame> videoGames = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("files/videogames.csv"));
            bufferedReader.readLine();
            String videoGameString;
            while((videoGameString = bufferedReader.readLine()) != null) {
                if(videoGameString.isEmpty()){
                    System.out.println("Can't read this line. It appears to be empty");
                    continue;
                }
                String[] videoGameArr = videoGameString.split(",");
                if(videoGameArr.length != 5) {
                    System.out.println("Can't parse this line. It appears to not have 5 parts");
                    continue;
                }
                VideoGame game = new VideoGame(videoGameArr[0], videoGameArr[1], videoGameArr[2], Integer.parseInt(videoGameArr[3]), Double.parseDouble(videoGameArr[4]));
                videoGames.add(game);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return videoGames;
    }
}
