package by.itacademy.lecture14.synchronizer.exchanger;

import static by.itacademy.lecture14.synchronizer.exchanger.ExchangerExample.EXCHANGER;

public class Postman implements Runnable {

    private final String id;
    private final String departure;
    private final String destination;
    private final Letter[] letters;

    public Postman(String id, String departure, String destination, Letter[] letters) {
        this.id = id;
        this.departure = departure;
        this.destination = destination;
        this.letters = letters;
    }

    @Override
    public void run() {
        try {
            System.out.printf("Почтальон %s получил письма : %s, %s\n", id, letters[0], letters[1]);
            System.out.printf("Почтальон %s выехал из %s в %s\n", id, departure, destination);

            Thread.sleep((long) (Math.random() * 5000) + 5000);
            System.out.printf("Почтальон %s приехал в пункт Д\n", id);

            // Самоблокировка потока для обмена письмами
            letters[1] = EXCHANGER.exchange(letters[1]);

            // Обмен письмами
            System.out.printf("Почтальон %s получил письма для %s\n", id, destination);

            Thread.sleep(1000 + (long) (Math.random() * 5000));
            System.out.printf("Почтальон %s привез в %s : %s, %s\n", id, destination, letters[0], letters[1]);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
