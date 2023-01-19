package by.itacademy.practice1.bookshop.menu;

import by.itacademy.practice1.bookshop.entity.book.Book;
import by.itacademy.practice1.bookshop.entity.book.Genre;
import by.itacademy.practice1.bookshop.menu.action.SearchBookAction;
import by.itacademy.practice1.bookshop.service.AuthorService;
import by.itacademy.practice1.bookshop.service.BookshopService;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);
    private static BookshopService bookshopService = new BookshopService();
    private static AuthorService authorService = new AuthorService();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в книжный магазин!");
        System.out.println("Выберите действие: 1 - Перейти в книги, 2 - Найти книги по жанру, 3 - Выход");

        int choice = scanner.nextInt();

        boolean exit = false;
        while(!exit) {
            switch (choice) {
                case 1:
                    System.out.println(authorService.getAuthorsSortedByFullName());
                case 2:
                    new SearchBookAction().act();
                case 3:
                    exit = true;
                    break;
            }
        }
    }


}
