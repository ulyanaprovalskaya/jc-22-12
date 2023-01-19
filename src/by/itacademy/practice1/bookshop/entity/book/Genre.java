package by.itacademy.practice1.bookshop.entity.book;

public enum Genre {
    FANTASY,
    HISTORY,
    DETECTIVE,
    NON_FICTION,
    COMICS,
    FAIRY_TALES,
    CLASSICS;

    public static Genre getGenreByIndex(int index) {
        for(Genre genre : Genre.values()) {
            if (genre.ordinal() == index) {
                return genre;
            }
        }
        return null;
    }
}
