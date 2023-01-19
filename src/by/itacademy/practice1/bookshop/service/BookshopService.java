package by.itacademy.practice1.bookshop.service;

import by.itacademy.practice1.bookshop.entity.book.Book;
import by.itacademy.practice1.bookshop.entity.book.Genre;
import by.itacademy.practice1.bookshop.repository.BookRepository;
import java.util.ArrayList;
import java.util.List;

public class BookshopService {

    private final BookRepository bookRepository = new BookRepository();

    public List<Book> getBooksByGenre(Genre genre) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookRepository.getBooks()) {
            if(book.getGenres().contains(genre)) {
                result.add(book);
            }
        }

        return result;
    }
}
