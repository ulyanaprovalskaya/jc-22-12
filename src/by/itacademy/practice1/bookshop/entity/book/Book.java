package by.itacademy.practice1.bookshop.entity.book;

import by.itacademy.practice1.bookshop.entity.Product;
import java.util.List;

public class Book extends Product {

    private String name;
    private Author author;
    private List<Genre> genres;
    private short yearOfPublishing;

    public Book(String name, Author author, List<Genre> genres, short yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.genres = genres;
        this.yearOfPublishing = yearOfPublishing;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(name).append(", ")
          .append(author)
          .append(". Год издания ").append(yearOfPublishing);
        return sb.toString();
    }
}
