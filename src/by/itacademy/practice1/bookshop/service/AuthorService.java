package by.itacademy.practice1.bookshop.service;

import by.itacademy.practice1.bookshop.entity.book.Author;
import by.itacademy.practice1.bookshop.repository.AuthorRepository;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AuthorService {

    private final AuthorRepository authorRepository = new AuthorRepository();

    public List<Author> getAuthors() {
        return authorRepository.getAuthors();
    }

    public List<Author> getAuthorsSortedByFullName() {
        List<Author> authors = new ArrayList<>(authorRepository.getAuthors());
        authors.sort(new Comparator<Author>() {
            @Override
            public int compare(Author o1, Author o2) {
                String fullNameFirst = o1.getLastName() + o1.getFirstName();
                String fullNameSecond = o2.getLastName() + o2.getFirstName();
                return fullNameFirst.compareTo(fullNameSecond);
            }
        });

        return authors;
    }
}
