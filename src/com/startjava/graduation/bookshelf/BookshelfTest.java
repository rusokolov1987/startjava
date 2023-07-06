package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        int command;
        while (true) {
            showBookCase(bookshelf);
            menu();
            try {
                command = Integer.parseInt(selectMenuItem());
                switch (command) {
                    case 1:
                        addBook(bookshelf);
                        break;
                    case 2:
                        deleteBook(bookshelf);
                        break;
                    case 3:
                        showBook(bookshelf);
                        break;
                    case 4:
                        bookshelf.clean();
                        System.out.println("Шкаф пуст!");
                        break;
                    case 5:
                        System.out.println("Вы закрыли шкаф! Всего доброго!");
                        return;
                    default:
                        System.out.println("Такого пункта в меню нет!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода!");
            }
            inputEnter();
        }
    }

    private static void menu() {
        System.out.println("""
                    Меню
                1. Добавить
                2. Удалить
                3. Найти
                4. Очистить шкаф
                5. Выйти
                """);
    }

    private static String selectMenuItem() {
        System.out.println("Введите номер пункта меню!");
        return new Scanner(System.in).nextLine();
    }

    private static void showBookCase(Bookshelf bookshelf) {
        if (bookshelf.getCountBooks() == 0) {
            System.out.println("Шкаф пуст! Вы можете добавить первую книгу!");
        } else {
            System.out.println("В шкафу " + bookshelf.getCountBooks() + " книг и свободно " +
                    bookshelf.getEmptyShelfs() + " полок.");
            showBookshelf(bookshelf);
        }
    }

    private static void addBook(Bookshelf bookshelf) {
        try {
            bookshelf.add(new Book(input("Введите автора"), input("Введите название книги"),
                    Integer.parseInt(input("Введите дату публикации"))));
            System.out.println("Книга добавлена в шкаф!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deleteBook(Bookshelf bookshelf) {
        try {
            bookshelf.delete(input("Введите название книги, которую хотите убрать с полки."));
            System.out.println("Книга успешно удалена!");
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void showBook(Bookshelf bookshelf) {
        try {
            Book book = bookshelf.search(input("Введите название книги, которую хотите найти в шкафу."));
            System.out.println("Книга найдена: " + book);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static String input(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    private static void showBookshelf(Bookshelf bookshelf) {
        int length = bookshelf.getBooks().length;
        Book[] books = bookshelf.getBooks();
        for (int i = 0; i < length; i++) {
            if (books[i] == null) {
                System.out.printf("%s", "|                                          |\n");
                break;
            }
            System.out.printf("%s%s%s", "|", books[i] , "|\n");
            System.out.printf("%s", "|------------------------------------------|\n");
        }
    }

    private static void inputEnter() {
        while (true) {
            System.out.println("Нажмите Enter для продолжения работы!");
            String enter = new Scanner(System.in).nextLine();
            if (enter.isEmpty()) {
                break;
            }
        }
    }
}