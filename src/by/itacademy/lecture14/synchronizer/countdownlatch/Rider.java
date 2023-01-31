package by.itacademy.lecture14.synchronizer.countdownlatch;

import static by.itacademy.lecture14.synchronizer.countdownlatch.Race.LATCH;
import static by.itacademy.lecture14.synchronizer.countdownlatch.Race.TRACK_LENGTH;

public class Rider implements Runnable {

    private final int number;
    private final int speed ;

    public Rider(int number, int speed) {
        this.number = number;
        this.speed  = speed;
    }

    @Override
    public void run() {
        try {
            System.out.printf("Всадник %d вышел на старт\n", number);
            //  Уменьшаем счетчик на 1
            LATCH.countDown();

            // Метод await блокирует поток до тех пор, пока счетчик CountDownLatch не обнулится
            LATCH.await();
            // Ожидание, пока всадник не преодолеет трассу
            Thread.sleep(TRACK_LENGTH / speed * 10);
            System.out.printf("Всадник %d финишировал\n", number);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
