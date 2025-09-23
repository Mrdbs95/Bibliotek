package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    // Lägg till en bok
    public void addBook(Book book) {
        books.add(book);
    }

    // Lista alla böcker
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Inga böcker i biblioteket ännu.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    // Hitta en bok efter titel (returnerar första matchen)
    public Book findBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null; // om ingen hittades
    }
}