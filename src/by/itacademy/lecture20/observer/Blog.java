package by.itacademy.lecture20.observer;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Publisher {

    private String name;
    private List<Subscriber> subscribers = new ArrayList<>();

    public Blog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void post(String event) {
        System.out.printf("Произошло событие в блоге %s: %s\n", name, event);
        for (Subscriber s : subscribers) {
            s.receiveNotification(this, event);
        }
    }

    @Override
    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }
}
