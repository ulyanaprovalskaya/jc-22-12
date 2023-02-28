package by.itacademy.lecture20.proxy;

public class ProxyApplication {

    public static void main(String[] args) {
        Internet internet = new InternetProvider();
        internet.connect("abc.com");

        ProxyProvider proxyProvider = new ProxyProvider(internet);
        proxyProvider.connect("available.com");
        proxyProvider.connect("abc.com");
    }
}
