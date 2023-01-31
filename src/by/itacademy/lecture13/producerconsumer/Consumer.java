package by.itacademy.lecture13.producerconsumer;

public class Consumer implements Runnable {

    private final Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < shop.size; i++) {
            shop.get();
        }
    }
}
