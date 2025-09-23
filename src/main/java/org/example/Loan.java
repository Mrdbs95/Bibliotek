package org.example;


    public class Loan {
        private Book book;
        private Member member;
        private Library library;
        private boolean avaiable;

        public Loan(Book book, Member member,Library library) {
            this.member = member;
            this.book = book;
            this.library = library;
        }
//get funktion från member if member godkänt loan = godkänns
        public Book getBook(){return book;}
        public Member getMember(){return member;}
        public Library getLibrary(){return library;}







    }
