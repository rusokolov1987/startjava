package com.startjava.graduation.bookshelf;

public class Bookshelf {
    private static final int CAPACITY = 10;
    private int countBook;
    private Book[] books;

    public Bookshelf() {
        books = new Book[CAPACITY];
    }

    public boolean addBook(Book book) {
        if (countBook < CAPACITY) {
            books[countBook++] = book;
            return true;
        }
        throw new RuntimeException("Книга не может быть добавлена, т.к. все полки в шкафу заняты!");
    }

    public boolean deleteBook(String title) {
        int index = find(title);
        if (index == -1) {
            throw new RuntimeException("Книга не найдена и не может быть удалена");
        }
        System.arraycopy(books, index + 1, books, index, books.length - index - 1);
        countBook--;
        return true;
    }

    public Book searchBook(String title) {
        for (Book volume : books) {
            if (volume != null && volume.getTitle().toLowerCase().equals(title.toLowerCase())) {
                return volume;
            }
        }
        throw new RuntimeException("Книга не найдена");
    }

    public Book showBook(int index) {
        return books[index];
    }

    public int getCountBook() {
        return countBook;
    }

    public int getEmptyShelf() {
        return books.length - countBook;
    }

    public void clean() {
        countBook = 0;
        books = new Book[10];
    }

    private int find(String title) {
        for (int i = 0; i < countBook; i++) {
            if (books[i].getTitle().toLowerCase().equals(title.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
}