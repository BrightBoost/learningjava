package com.pluralsight.week3.videogameexercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VideoGameApp {
    public static void main(String[] args) {
        appendGame();
        printStats(readCsvFile());

    }

    public static void printStats(List<VideoGame> videoGames) {
        System.out.println("Games loaded: " + videoGames.size());
        if(videoGames.size() == 0) {
            System.out.println("No more data, because no games.");
            return;
        }
        double totalRating = 0;
        int oldestReleaseYear = videoGames.get(0).getYear();
        int nrOfPcTitles = 0;

        for(int i = 0; i < videoGames.size(); i++) {
            totalRating += videoGames.get(i).getRating();
            if(videoGames.get(i).getPlatform().equalsIgnoreCase("PC")) {
                nrOfPcTitles++;
            }
            if(oldestReleaseYear > videoGames.get(i).getYear()) {
                oldestReleaseYear = videoGames.get(i).getYear();
            }
        }

        System.out.println("Nr of pc titles: " + nrOfPcTitles);
        System.out.println("Oldest release year: " + oldestReleaseYear);
        System.out.println("Average rating: " + totalRating / videoGames.size());

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

    public static void appendGame() {
        VideoGame game = new VideoGame("minecraft", "switch", "adventure", 2015, 7.4);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/videogames.csv", true));
            bufferedWriter.write(game.toCsvString() + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
