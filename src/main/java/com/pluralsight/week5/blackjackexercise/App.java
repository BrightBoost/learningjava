package com.pluralsight.week5.blackjackexercise;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(3+ 5 + "Java" + 2 + 5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the name of player 1?");
        String namePlayer1 = scanner.nextLine();
        System.out.println("What's the name of player 2?");
        String namePlayer2 = scanner.nextLine();

        Deck deck = new Deck();
        deck.shuffle();

        Hand handPlayer1 = new Hand();
        Hand handPlayer2 = new Hand();

        initializeHand(deck, handPlayer1, 2);
        initializeHand(deck, handPlayer2, 2);

        int valuePlayer1 = handPlayer1.getValue();
        int valuePlayer2 = handPlayer2.getValue();

        System.out.println("value player 1: " + valuePlayer1);
        System.out.println("value player 2: " + valuePlayer2);

        // both above 21
        if(valuePlayer1 > 21 && valuePlayer2 > 21) {
            System.out.println("Both above 21, invalid game!");
        } else if(valuePlayer1 == valuePlayer2) {
            System.out.println("Both same value, invalid game!");
        } else if(valuePlayer1 < 21 && valuePlayer2 < 21) {
            // both under 21
            String nameWinner = valuePlayer1 - 21 > valuePlayer2 - 21 ? namePlayer1 : namePlayer2;
            System.out.println("the winner is: " + nameWinner);
        } else if(valuePlayer1 > 21) {
            System.out.println("the winner is: " + namePlayer2);
        } else if(valuePlayer2 > 21) {
            System.out.println("the winner is: " + namePlayer1);
        } else {
            System.out.println("not sure what happened");
        }
    }

    public static void initializeHand(Deck deck, Hand hand, int nrOfCards) {
        // deal 2 cards
        for(int i = 0; i < nrOfCards; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand.deal(card);
        }
    }
}
