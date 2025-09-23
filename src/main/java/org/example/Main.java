package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Draktränaren 1", 255);
        Book book2 = new Book("Draktränaren 2", 265);
        Book book3 = new Book("Draktränaren 3", 275);
        Book book4 = new Book("Draktränaren 4", 285);
        Book book5 = new Book("Draktränaren 5", 295);
        Book book6 = new Book("Draktränaren 6", 305);
        Book book7 = new Book("Draktränaren 7", 315);
        Book book8 = new Book("Draktränaren 8", 325);
        Book book9 = new Book("Draktränaren 9", 335);
        Book book10 = new Book("Draktränaren 10", 345);
        Book book11 = new Book("Draktränaren 11", 355);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        library.addBook(book11);

        for(Book book : library.getBooks()) {
            System.out.println(book.getTitle() + " av "+ book.getPages());

        }
    }
}