package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showBookCase(bookshelf);
            messageWindow();
            try {
                int itemNumber = selectMenuItem(scanner);
                if (launch(scanner, bookshelf, itemNumber) == -1) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            inputEnter();
        }
    }

    private static void showBookCase(Bookshelf bookshelf) {
        if (bookshelf.getCountBooks() == 0) {
            System.out.println("Шкаф пуст! Вы можете добавить первую книгу!");
        } else {
            System.out.println("В шкафу " + bookshelf.getCountBooks() + " книг и свободно " +
                    bookshelf.getEmptyShelfs() + " полок.");
            Book[] books = bookshelf.getBooks();
            int maxLength = getMaxLength(bookshelf);
            for (Book book : books) {
                System.out.printf("%s%s%s%s", "|", book , " ".repeat(Math.abs(book.getLengthInfo() - maxLength)), "|\n");
                System.out.printf("%s%s%s", "|", "-".repeat(maxLength), "|\n");
            }
            System.out.printf("%s%s%s", "|", " ".repeat(maxLength), "|\n");
        }
    }

    private static int getMaxLength(Bookshelf bookshelf) {
        int maxlength = 0;
        Book[] books = bookshelf.getBooks();
        for (Book book : books) {
            maxlength = Math.max(maxlength, book.getLengthInfo());
        }
        return maxlength;
    }

    private static void messageWindow() {
        System.out.println("""
                    Меню
                1. Добавить
                2. Удалить
                3. Найти
                4. Очистить шкаф
                5. Выйти
                """);
    }

    private static int selectMenuItem(Scanner scanner) {
        try {
            int itemNumber = Integer.parseInt(input("Введите номер пункта меню!", scanner));
            if (itemNumber < 0) {
                throw new RuntimeException("Такого пункта в меню нет!");
            }
            return itemNumber;
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Неверный формат ввода!");
        }
    }

    private static String input(String message, Scanner scanner) {
        System.out.println(message);
        return scanner.nextLine();
    }

    private static int launch(Scanner scanner, Bookshelf bookshelf, int itemNumber) {
        return switch (itemNumber) {
            case 1 -> {
                addBook(bookshelf, scanner);
                yield 1;
            }
            case 2 -> {
                deleteBook(bookshelf, scanner);
                yield 1;
            }
            case 3 -> {
                searhBook(bookshelf, scanner);
                yield 1;
            }
            case 4 -> {
                bookshelf.clean();
                System.out.println("Шкаф пуст!");
                yield 1;
            }
            case 5 -> {
                System.out.println("Вы закрыли шкаф! Всего доброго!");
                yield -1;
            }
            default -> throw new RuntimeException("Такого пункта в меню нет!");
        };
    }

    private static void addBook(Bookshelf bookshelf, Scanner scanner) {
        try {
            bookshelf.add(new Book(input("Введите автора", scanner), input("Введите название книги", scanner),
                    Integer.parseInt(input("Введите дату публикации", scanner))));
            System.out.println("Книга добавлена в шкаф!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deleteBook(Bookshelf bookshelf, Scanner scanner) {
        try {
            bookshelf.delete(input("Введите название книги, которую хотите убрать с полки.", scanner));
            System.out.println("Книга успешно удалена!");
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void searhBook(Bookshelf bookshelf, Scanner scanner) {
        try {
            Book book = bookshelf.search(input("Введите название книги, которую хотите найти в шкафу.", scanner));
            System.out.println("Книга найдена: " + book);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
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