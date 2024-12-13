/*
 * This source file was generated by the Gradle 'init' task
 */
// package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "\nWelcome to Library Management System\n";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Book mybook = new Book(001, "1814", "Milad", "Romance", true);
        Book romeo = new Book(002, "Romeno & Juliet", "Jack Landan", "Romance", true);

        Library simiLibrary = new Library();
        simiLibrary.addBook(mybook);
        simiLibrary.addBook(romeo);

        Member milad = new Member(001, "Milad Ghoreishi", "Elite", new ArrayList<Book>(), true);
        simiLibrary.registerMember(milad);
        milad.borrowBook(romeo);
        milad.returnBook(romeo);

        ArrayList<String> availableBooks = simiLibrary.getAvailableBooks();
        System.out.println("Available books are: ");
        for (String e : availableBooks) {
            System.out.println(e);    
        }
        
        Transaction simTransactions = new Transaction(001, 001, 001, LocalDate.of(2024,10,10), LocalDate.of(2024,12,10));
        System.out.println(simTransactions);    
        
        System.out.println("Fine due to late return is $" + simTransactions.calculateFine(2.5));
        

    }
}
