package com.thuchanh.th.Entity;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book() {
    }

    public Book(String tt, String a, int y) {
        this.title = tt;
        this.author = a;
        this.year = y;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tt) {
        this.title = tt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        this.year = y;
    }
}
