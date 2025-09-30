package com.pluralsight.week2;

public class HighScoreWins {
    public static void main(String[] args) {
        String highscore = "Home:Visitor|1:9";
        // split it on pipe |
        String[] scoreParts = highscore.split("\\|");
        // Split both halves of :
        String[] teams = scoreParts[0].split(":");
        String[] scores = scoreParts[1].split(":");

        // parse/process the results
        String team1 = teams[0];
        String team2 = teams[1];
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        // decide who wins
        if(score1 > score2) {
            System.out.println("Winner: " + team1);
        } else if(score1 < score2) {
            System.out.println("Winner:" + team2);
        } else {
            System.out.println("No winner");
        }

    }
}
