// =========================
// Assignment 1: Daily Mood Logger
// =========================

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class MoodLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("[1] Log today’s mood");
            System.out.println("[2] View past moods");
            System.out.println("[3] Exit");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    logMood(scanner);
                    break;
                case "2":
                    viewMoods();
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void logMood(Scanner scanner) {
        System.out.print("How are you feeling today? ");
        String mood = scanner.nextLine();
        String entry = LocalDate.now() + ": " + mood;

        try (FileWriter writer = new FileWriter("moodlog.txt", true)) {
            writer.write(entry + "\n");
            System.out.println("Mood saved!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    private static void viewMoods() {
        try (BufferedReader reader = new BufferedReader(new FileReader("moodlog.txt"))) {
            String line;
            System.out.println("\n--- Mood History ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}


// =========================
// Assignment 2: Flashcard Quiz App
// =========================

import java.util.Scanner;

public class FlashcardQuiz {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "What is 5 + 7?",
            "What programming language are we learning?",
            "What is the square root of 81?",
            "What does OOP stand for?"
        };

        String[] answers = {
            "Paris",
            "12",
            "Java",
            "9",
            "Object Oriented Programming"
        };

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + answers[i]);
            }
        }

        System.out.println("\nYou got " + score + " out of " + questions.length + " correct.");
        System.out.println("Score: " + (score * 100 / questions.length) + "%");
    }
}


// =========================
// Assignment 3: Random Quote Generator
// =========================

import java.util.Random;
import java.util.Scanner;

public class RandomQuoteGenerator {
    public static void main(String[] args) {
        String[] quotes = {
            "Be yourself; everyone else is already taken.",
            "The best way to get started is to quit talking and begin doing.",
            "Do what you can, with what you have, where you are.",
            "The only way to do great work is to love what you do.",
            "Believe you can and you're halfway there.",
            "The future belongs to those who prepare for it today.",
            "Keep your face always toward the sunshine—and shadows will fall behind you.",
            "Success is not how high you have climbed, but how you make a positive difference.",
            "Don't watch the clock; do what it does. Keep going.",
            "It always seems impossible until it's done."
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\nWelcome to the Random Quote Generator!");

        while (true) {
            System.out.print("\nPress Enter to see a quote or type 'exit' to stop: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            int index = random.nextInt(quotes.length);
            System.out.println("\nQuote: " + quotes[index]);
        }
    }
}


// =========================
// Assignment 4: Quote Generator with File Support
// =========================

import java.io.*;
import java.util.*;

public class QuoteGeneratorV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("[1] Show all quotes");
            System.out.println("[2] Show a random quote");
            System.out.println("[3] Add a new quote");
            System.out.println("[4] Exit");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    showAllQuotes();
                    break;
                case "2":
                    showRandomQuote();
                    break;
                case "3":
                    addNewQuote(scanner);
                    break;
                case "4":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void showAllQuotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader("quotes.txt"))) {
            String line;
            System.out.println("\n--- All Quotes ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Could not read quotes.");
        }
    }

    private static void showRandomQuote() {
        List<String> quotes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("quotes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                quotes.add(line);
            }
        } catch (IOException e) {
            System.out.println("Could not read quotes.");
            return;
        }

        if (quotes.isEmpty()) {
            System.out.println("No quotes available.");
        } else {
            Random random = new Random();
            String quote = quotes.get(random.nextInt(quotes.size()));
            System.out.println("\nRandom Quote: " + quote);
        }
    }

    private static void addNewQuote(Scanner scanner) {
        System.out.print("Enter your new quote: ");
        String quote = scanner.nextLine();

        try (FileWriter writer = new FileWriter("quotes.txt", true)) {
            writer.write(quote + "\n");
            System.out.println("Quote added!");
        } catch (IOException e) {
            System.out.println("Could not write quote.");
        }
    }
}
