package by.itacademy.practice1.bookshop.book;

import by.itacademy.practice1.bookshop.Product;

public class Book extends Product {

    private String name;
    private Author author;
    private Genre[] genres;
    private short yearOfPublishing;

    public Book(String name, Author author, Genre[] genres, short yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.genres = genres;
        this.yearOfPublishing = yearOfPublishing;
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
