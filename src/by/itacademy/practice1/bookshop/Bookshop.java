package by.itacademy.practice1.bookshop;

import by.itacademy.practice1.bookshop.book.Author;
import by.itacademy.practice1.bookshop.book.Book;
import by.itacademy.practice1.bookshop.book.Genre;
import by.itacademy.practice1.bookshop.util.ArrayUtil;
import java.util.List;

/*
покупать товары
получать список доступных товаров по категории (книги, канцелярию)
 */
public class Bookshop {

    private Book[] books;
    private Author[] authors;

    public Bookshop() {
        initBooks();
    }

    public List<Book> getBooks() {
        return ArrayUtil.processArray(books);
    }

    public List<Author> getAuthors() {
        return ArrayUtil.processArray(authors);
    }

    private void initBooks() {
        books = new Book[5];

        Book warAndPeace = new Book("Война и мир",
                                    new Author("Лев",  "Толстой", 1800),
                                    new Genre[] {Genre.CLASSICS}, (short) 2018);

        Book crimeAndPunishment = new Book("Преступление и наказание",
                             new Author("Федор",  "Достоевский", 1801),
                             new Genre[] {Genre.CLASSICS}, (short) 2020);

        books[0] = warAndPeace;
        books[1] = crimeAndPunishment;
    }
}
