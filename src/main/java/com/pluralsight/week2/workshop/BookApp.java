package com.pluralsight.week2.workshop;

import java.util.Scanner;

public class BookApp {
    static Scanner scanner = new Scanner(System.in);
    static Book[] books = loadBooks();
    public static void main(String[] args) {
        boolean endProgram = false;
        while(!endProgram) {
            endProgram = showHomeScreen();
        }

    }

    public static boolean showHomeScreen() {
        boolean endProgram = false;
        String homeScreenText= """
                1) Show available books
                2) Show checked out books
                3) Exit program
                """;
        System.out.println("What do you want to do?");
        System.out.println(homeScreenText);
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                showAvailableBooks();
                break;
            case 2:
                showCheckedOutBooks();
                break;
            case 3:
                endProgram = true;
                break;
            default:
                System.out.println("That's not an option. Please choose again.");
        }
        return endProgram;

    }

    public static void showAvailableBooks() {
        for(int i = 0; i < books.length; i++) {
            if(!books[i].isCheckedOut()) {
                System.out.println(i + ": " + books[i].getTitle() + " | " + books[i].getIsbn() + " | " + books[i].getId());
            }
        }
        System.out.println("Enter the number of the book you want to checkout, type -1 for the homescreen.");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice > -1) {
            System.out.println("What is the name to check the book out to?");
            String name = scanner.nextLine();
            books[choice].checkOut(name);
        }
    }

    public static void showCheckedOutBooks() {
        for(int i = 0; i < books.length; i++) {
            if(books[i].isCheckedOut()) {
                System.out.println(i + ": " + books[i].getTitle() + " | " + books[i].getIsbn() + " | " + books[i].getCheckedOutTo() + " | " + books[i].getId());
            }
        }
        System.out.println("Choose C to check in a book and X to go back to the homescreen");
        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("c")) {
            checkInBook();
        } // you should do handling of anything other than X here
    }

    public static void checkInBook() {
        System.out.println("What book id do you want to checkin?");
        int bookId = scanner.nextInt();
        scanner.nextLine();
        boolean foundBook = false;
        for(int i = 0; i < books.length && !foundBook; i++) {
            if(books[i].getId() == bookId) {
                books[i].checkIn();
                foundBook = true;
            }
        }
        if(!foundBook) {
            System.out.println("Didn't find that id... CHECKIN FAILED");
        }
    }

    public static Book[] loadBooks() {
        return new Book[] {
                new Book(1, "9780140449136", "The Odyssey", false, ""),
                new Book(2, "9780439139601", "Harry Potter and the Goblet of Fire", true, "User123"),
                new Book(3, "9780141439600", "Pride and Prejudice", false, ""),
                new Book(4, "9780307476463", "The Road", true, "User456"),
                new Book(5, "9780743273565", "The Great Gatsby", false, ""),
                new Book(6, "9780553386790", "A Game of Thrones", true, "User789"),
                new Book(7, "9780061120084", "To Kill a Mockingbird", false, ""),
                new Book(8, "9780385472579", "Zen and the Art of Motorcycle Maintenance", false, ""),
                new Book(9, "9780345339706", "The Hobbit", true, "User234"),
                new Book(10, "9781451673319", "Fahrenheit 451", false, ""),
                new Book(11, "9780142437230", "Moby-Dick", false, ""),
                new Book(12, "9780060850524", "Brave New World", true, "User876"),
                new Book(13, "9780143105985", "Meditations", false, ""),
                new Book(14, "9780525566151", "Where the Crawdads Sing", false, ""),
                new Book(15, "9780679783268", "1984", true, "User345"),
                new Book(16, "9780747532743", "Harry Potter and the Philosopher's Stone", false, ""),
                new Book(17, "9780812981605", "The Power of Habit", false, ""),
                new Book(18, "9780307277671", "The Kite Runner", true, "User567"),
                new Book(19, "9780316769488", "The Catcher in the Rye", false, ""),
                new Book(20, "9780062315007", "Sapiens: A Brief History of Humankind", true, "User999")
        };


    }
}
