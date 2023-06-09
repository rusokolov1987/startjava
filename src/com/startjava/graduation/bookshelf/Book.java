package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int published;
    private int lengthInfo;

    public Book(String author, String title, int published) {
        this.author = author;
        this.title = title;
        this.published = published;
        lengthInfo = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getLengthInfo() {
        return lengthInfo;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + published;
    }
}