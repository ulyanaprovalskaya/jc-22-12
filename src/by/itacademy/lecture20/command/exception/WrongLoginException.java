package by.itacademy.lecture20.command.exception;

public class WrongLoginException extends RuntimeException {

    public WrongLoginException(String message) {
        super(message);
    }
}
