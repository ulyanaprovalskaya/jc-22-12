package by.itacademy.practice1.bookshop.repository;

import by.itacademy.practice1.bookshop.entity.book.Author;
import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {

    private final List<Author> authors = new ArrayList<>();

    public AuthorRepository() {
        initAuthors();
    }

    public List<Author> getAuthors() {
        return authors;
    }

    private void initAuthors() {
        Author tolstoy = new Author("Лев", "Толстой", 1800);
        Author dostoevskiy = new Author("Федор",  "Достоевский", 1801);

        authors.add(tolstoy);
        authors.add(dostoevskiy);
    }
}
