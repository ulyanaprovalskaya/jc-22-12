package by.itacademy.lecture11;

public class CarNotfoundException extends RuntimeException {

    public CarNotfoundException() {

    }

    public CarNotfoundException(String message) {
        super(message);
    }
}
