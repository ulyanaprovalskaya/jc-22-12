package by.itacademy.lecture20.observer;

public interface Publisher {

    void post(String event);

    void subscribe(Subscriber s);

    void unsubscribe(Subscriber s);

}
