package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int CAPACITY = 10;
    private int countBooks;
    private Book[] books;

    public Bookshelf() {
        books = new Book[CAPACITY];
    }

    public void add(Book book) {
        if (countBooks >= CAPACITY) {
            throw new RuntimeException("Книга не может быть добавлена, т.к. все полки в шкафу заняты!");
        }
        books[countBooks++] = book;
    }

    public void delete(String title) {
        int index = find(title);
        if (index == -1) {
            throw new RuntimeException("Книга не найдена и не может быть удалена");
        }
        System.arraycopy(books, index + 1, books, index, countBooks - index - 1);
        countBooks--;
    }

    public Book search(String title) {
        int index = find(title);
        if (index >= 0) {
            return books[index];
        }
        throw new RuntimeException("Книга не найдена");
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getEmptyShelfs() {
        return CAPACITY - countBooks;
    }

    public void clean() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }

    private int find(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().toLowerCase().equals(title.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
}