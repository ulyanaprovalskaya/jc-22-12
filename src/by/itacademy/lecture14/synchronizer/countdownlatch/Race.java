package by.itacademy.lecture14.synchronizer.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Race {
    public static final CountDownLatch LATCH = new CountDownLatch(8);
    public static final int TRACK_LENGTH = 3000;
    private static final int RIDERS_COUNT = 5;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= RIDERS_COUNT; i++) {
            new Thread(new Rider(i, (int) (Math.random() * 10 + 5))).start();
            Thread.sleep(1000);
        }

        while (LATCH.getCount() > 3) {
            Thread.sleep(100);
        }

        Thread.sleep(1000);
        System.out.println("На старт!");
        LATCH.countDown();  // Уменьшаем счетчик на 1
        Thread.sleep(1000);
        System.out.println("Внимание!");
        LATCH.countDown(); // Уменьшаем счетчик на 1
        Thread.sleep(1000);
        System.out.println("Марш!");
        LATCH.countDown(); // Уменьшаем счетчик на 1
        // Счетчик обнулен, и все ожидающие этого события потоки разблокированы
    }
}
