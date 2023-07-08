package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        while (true) {
            show(bookshelf);
            printMenu();
            try {
                int itemNumber = selectMenuItem();
                if (launch(bookshelf, itemNumber) == -1) {
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
            }
            inputEnter();
        }
    }

    private static void show(Bookshelf bookshelf) {
        if (bookshelf.getCountBooks() == 0) {
            System.out.println("Шкаф пуст! Вы можете добавить первую книгу!");
        } else {
            System.out.println("В шкафу " + bookshelf.getCountBooks() + " книг и свободно " +
                    bookshelf.getEmptyShelfs() + " полок.");
            Book[] books = bookshelf.getBooks();
            int maxLength = bookshelf.getMaxLength();
            for (Book book : books) {
                System.out.println("|" + book + " ".repeat(maxLength - book.getLengthInfo()) + "|");
                System.out.println("|" + "-".repeat(maxLength) + "|");
            }
            System.out.print("|" + "-".repeat(maxLength) + "|\n");
        }
    }

    private static void printMenu() {
        System.out.println("""
                    Меню
                1. Добавить
                2. Удалить
                3. Найти
                4. Очистить шкаф
                5. Выйти
                """);
    }

    private static int selectMenuItem() {
        try {
            int itemNumber = Integer.parseInt(input("Введите номер пункта меню!"));
            if (itemNumber < 0) {
                throw new RuntimeException("Такого пункта в меню нет!");
            }
            return itemNumber;
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Неверный формат ввода!");
        }
    }

    private static int launch(Bookshelf bookshelf, int itemNumber) {
        int check = 0;
        switch (itemNumber) {
            case 1 -> addBook(bookshelf);
            case 2 -> deleteBook(bookshelf);
            case 3 -> searhBook(bookshelf);
            case 4 -> {
                bookshelf.clean();
                System.out.println("Шкаф пуст!");
            }
            case 5 -> {
                System.out.println("Вы закрыли шкаф! Всего доброго!");
                check = -1;
            }
            default -> throw new RuntimeException("Такого пункта в меню нет!");
        };
        return check;
    }

    private static void addBook(Bookshelf bookshelf) {
        try {
            bookshelf.add(new Book(input("Введите автора"), input("Введите название книги"),
                    Integer.parseInt(input("Введите дату публикации"))));
            System.out.println("Книга добавлена в шкаф!");
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
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

    private static void searhBook(Bookshelf bookshelf) {
        try {
            Book book = bookshelf.search(input("Введите название книги, которую хотите найти в шкафу."));
            System.out.println("Книга найдена: " + book);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static String input(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    private static void inputEnter() {
        while (true) {
            System.out.println("Нажмите Enter для продолжения работы!");
            String enter = scanner.nextLine();
            if (enter.isEmpty()) {
                break;
            }
        }
    }
}