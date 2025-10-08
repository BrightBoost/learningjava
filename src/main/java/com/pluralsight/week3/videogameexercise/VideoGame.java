package com.pluralsight.week3.videogameexercise;

public class VideoGame {
    private String title;
    private String platform;
    private String genre;
    private int year;
    private double rating;

    public VideoGame(String title, String platform, String genre, int year, double rating) {
        this.title = title;
        this.platform = platform;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public String toCsvString() {
        return title + "," + platform + "," + genre + "," + year + "," + rating;
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }
}
