package by.itacademy.lecture13.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    public final int size = 10;
    private final List<Object> products = new ArrayList<>();

    public synchronized void get() {
        while (products.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products.remove(products.size() - 1);
        System.out.println("Потребитель купил продукт, осталось " + products.size());
        notify();
    }

    public synchronized void put() {
        while (products.size() > 2 ) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products.add(new Object());
        System.out.println("Производитель добавил продукт на склад, осталось " + products.size());
        notify();
    }
}
