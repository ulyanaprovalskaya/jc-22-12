package by.itacademy.lecture20.observer;

public class ObserverApplication {

    public static void main(String[] args) {
        Subscriber s1 = new Subscriber("rainy_sun");
        Subscriber s2 = new Subscriber("coldWinter23");
        Subscriber s3 = new Subscriber("beautiful.spring");

        Blog blog = new Blog("Happy cooking");
        blog.subscribe(s1);
        blog.subscribe(s2);
        blog.subscribe(s3);

        blog.post("Новый пост: масленица подошла к концу :(");
    }
}
