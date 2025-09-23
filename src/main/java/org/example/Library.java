package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books; // Lista med böcker

    // Konstruktor
    public Library() {
        books = new ArrayList<>();
    }

    // Lägg till bok
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book can't be null");
        }
        books.add(book);
    }

    // Ta bort bok
    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    // Hitta bok med titel
    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Om ingen bok hittas
    }

    // Visa alla böcker
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Getter om du vill använda listan direkt
    public List<Book> getBooks() {
        return books;
    }
}