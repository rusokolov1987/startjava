package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("Шкаф пуст! Вы можете добавить первую книгу!");
        System.out.println("Вы в меню. Выберите операцию которую хотите выполнить.");
        System.out.println("1. Добавить.\n2. Удалить.\n3. Найти.\n4. Показать все книги.\n5. Количество книг в шкафу.\n" +
                "6. Количество пустых полок. \n7. Очистить полку.\n8. Завершить");
        int command = Integer.parseInt(input("Введите номер операции!"));
        Bookshelf bookshelf = new Bookshelf();
        switch (command) {
            case 1:
                    bookshelf.addBook(createBook());
                    break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
        }
    }

    private static String input(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    private static Book createBook() {
        return new Book(input("Введите автора"), input("Введите название книги"), Integer.parseInt(input("Введите дату публикации")));
    }
}