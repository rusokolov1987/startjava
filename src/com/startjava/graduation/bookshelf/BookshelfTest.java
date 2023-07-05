package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        String info = """
                1. Добавить
                2. Удалить
                3. Найти
                4. Показать все книги
                5. Количество книг в шкафу
                6. Количество пустых полок
                7. Очитсить шкаф
                8. Выйти
                """;
        menu(info);
    }

    private static void menu(String info) {
        Bookshelf bookshelf = new Bookshelf();
        while (true) {
            if (bookshelf.getCountBooks() == 0) {
                System.out.println("Шкаф пуст! Вы можете добавить первую книгу!");
            } else {
                System.out.println("В шкафу " + bookshelf.getCountBooks() + " книг и сивободно " +
                        bookshelf.getEmptyShelf() + " полок.");
                showBookshelf(bookshelf);
            }
            int command;
            while (true) {
                System.out.printf("%10s", "Меню\n");
                System.out.println(info);
                try {
                    command = Integer.parseInt(input("Введите номер операции!"));
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Такой операции не существует!");
                }
            }
            switch (command) {
                case 1:
                    try {
                        bookshelf.add(new Book(input("Введите автора"), input("Введите название книги"),
                                Integer.parseInt(input("Введите дату публикации"))));
                        System.out.println("Книга добавлена в шкаф!");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        bookshelf.delete(input("Введите название книги, которую хотите убрать с полки."));
                        System.out.println("Книга успешно удалена!");
                    } catch (RuntimeException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    try {
                        Book book = bookshelf.search(input("Введите название книги, которую хотите найти в шкафу."));
                        System.out.println("Книга найдена: " + book);
                    } catch (RuntimeException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    showBookshelf(bookshelf);
                    break;
                case 5:
                    System.out.println("Количество книг в шкафу: " + bookshelf.getCountBooks());
                    break;
                case 6:
                    System.out.println("Количество пустых полок в шкафу: " + bookshelf.getEmptyShelf());
                    break;
                case 7:
                    bookshelf.clean();
                    System.out.println("Шкаф пуст!");
                    break;
                case 8:
                    System.out.println("Вы вышли из программы!");
                    System.exit(0);
                default:
                    System.out.println("Такой операции не существует!");
            }
            keyPressed();
        }
    }

    private static String input(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    public static void showBookshelf(Bookshelf bookshelf) {
        try {
            Book[] books = bookshelf.getBooks();
            int length = books.length;
            for (int i = 0; i < length; i++) {
                if (books[i] == null) {
                    System.out.printf("%s", "|                                          |\n");
                    break;
                }
                System.out.printf("%s%s%s", "|", books[i] , "|\n");
                System.out.printf("%s", "|------------------------------------------|\n");
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void keyPressed() {
        while (true) {
            System.out.println("Нажмите Enter для продолжения работы!");
            String enter = new Scanner(System.in).nextLine();
            if (enter.isEmpty()) {
                break;
            }
        }
    }
}