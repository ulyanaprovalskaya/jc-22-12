package by.itacademy.practice1.bookshop.book;

public class Author {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Author(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(' ').append(lastName);
        return sb.toString();
    }
}
