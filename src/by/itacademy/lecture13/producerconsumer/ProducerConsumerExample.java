package by.itacademy.lecture13.producerconsumer;

public class ProducerConsumerExample {

    public static void main(String[] args) {
        Shop shop = new Shop();

        Producer producer = new Producer(shop);
        Consumer consumer = new Consumer(shop);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
