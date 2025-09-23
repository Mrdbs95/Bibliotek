package org.example;

public class Book {
    private String title;
    private int pages;

    //Konstruktor
    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
    //-----------------------------------------------------


    //------Setter & Getter Title-------------------------
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if(title == null || title.isBlank())
            throw new IllegalArgumentException("Missing Title");
        this.title = title;
    }
    //---------------------------------------------------------
//---------Setter & Getter Pages---------------------------
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages <= 0) {
            throw new IllegalArgumentException("Page must be over 0");
        }
        this.pages = pages;
    }
    //----------------------------------------------------------
    //--------Skriver ut info om boken--------------------------
    public String toString() {
        return "Book: " + title + "("+pages+" pages)";
    }
    //----------------------------------------------------------


}