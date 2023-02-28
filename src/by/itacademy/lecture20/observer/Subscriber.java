package by.itacademy.lecture20.observer;

public class Subscriber {

    private String nickName;

    public Subscriber(String nickName) {
        this.nickName = nickName;
    }

    public void receiveNotification(Blog blog, String event) {
        System.out.printf("%s получил уведомление от %s: %s\n", nickName, blog.getName(), event);
    }

}
