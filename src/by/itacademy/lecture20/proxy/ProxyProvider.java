package by.itacademy.lecture20.proxy;

import java.util.List;

public class ProxyProvider implements Internet {

    private static final List<String> BANNED_URL_LIST = List.of("abc.com", "qwerty.org", "123.by");

    private Internet internet;

    public ProxyProvider(Internet internet) {
        this.internet = internet;
    }

    @Override
    public void connect(String url) {
        if(!BANNED_URL_LIST.contains(url)) {
            internet.connect(url);
        } else {
            throw new IllegalArgumentException("Сбой подключения! Попытка доступа к запрещенному адресу: " + url);
        }
    }
}
