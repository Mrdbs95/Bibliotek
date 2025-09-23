package org.example;

import org.example.Book;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}