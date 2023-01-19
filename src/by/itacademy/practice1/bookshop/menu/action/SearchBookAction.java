package by.itacademy.practice1.bookshop.menu.action;

import by.itacademy.practice1.bookshop.entity.book.Book;
import by.itacademy.practice1.bookshop.entity.book.Genre;
import by.itacademy.practice1.bookshop.service.BookshopService;
import java.util.List;
import java.util.Scanner;

public class SearchBookAction {

    private Scanner scanner = new Scanner(System.in);
    private BookshopService bookshopService = new BookshopService();

    public void act() {
        System.out.println("Выберите жанр: ");
        for(int i = 0; i < Genre.values().length; i++) {
            System.out.println((i + 1) + " - " + Genre.values()[i]);
        }

        int chosenIndex = scanner.nextInt();
        Genre genre = Genre.getGenreByIndex(chosenIndex - 1);
        List<Book> books = bookshopService.getBooksByGenre(genre);
        System.out.println(books);
    }
}
