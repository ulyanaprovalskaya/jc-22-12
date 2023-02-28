package by.itacademy.lecture20.proxy;

public class InternetProvider implements Internet {

    @Override
    public void connect(String url) {
        System.out.println("Подключение к " + url);
    }
}
