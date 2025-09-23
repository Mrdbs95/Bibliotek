package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List <Book> books = new ArrayList<>();
    private List <Member> members = new ArrayList<>();
    private List <Loan> loan = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }
}
