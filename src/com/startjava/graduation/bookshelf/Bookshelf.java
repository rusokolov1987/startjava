package com.startjava.graduation.bookshelf;

public class Bookshelf {
    private int countBook;
    private Book[] books = new Book[10];

    public void addBook(Book book) {
        this.books[countBook++] = book;
    }

    public boolean deleteBook(Book book) {
        if (!searchBook(book)) {
            return false;
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {

            }
        }
        return true;
    }

    public boolean searchBook(Book book) {
        for (Book volume : books) {
            if (volume.equals(book)) {
                return true;
            }
        }
        return false;
    }

    public void showAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public int getCountBook() {
        return countBook;
    }

    public int getEmptyShelf() {
        return books.length - countBook;
    }

    public void clean(int shelf) {

    }
}