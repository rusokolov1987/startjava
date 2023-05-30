package com.startjava.graduation.bookshelf;

public class Book {
    String author;
    String title;
    int published;
    int lengthInfo;

    public Book(String author, String title, int published) {
        this.author = author;
        this.title = title;
        this.published = published;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + published;
    }
}