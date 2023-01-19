package by.itacademy.practice1.bookshop.repository;

import by.itacademy.practice1.bookshop.entity.book.Author;
import by.itacademy.practice1.bookshop.entity.book.Book;
import by.itacademy.practice1.bookshop.entity.book.Genre;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public BookRepository() {
        initBooks();
    }

    public List<Book> getBooks() {
        return books;
    }

    private void initBooks() {
        List<Genre> warAndPeaceGenres = new ArrayList<>();
        warAndPeaceGenres.add(Genre.CLASSICS);

        List<Genre> crimePrimeAndPunishment = new ArrayList<>();
        crimePrimeAndPunishment.add(Genre.CLASSICS);

        Book warAndPeace = new Book("Война и мир",
                                    new Author("Лев", "Толстой", 1800),
                                    warAndPeaceGenres, (short) 2018);

        Book crimeAndPunishment = new Book("Преступление и наказание",
                                           new Author("Федор",  "Достоевский", 1801),
                                           crimePrimeAndPunishment, (short) 2020);

        books.add(warAndPeace);
        books.add(crimeAndPunishment);
    }
}
