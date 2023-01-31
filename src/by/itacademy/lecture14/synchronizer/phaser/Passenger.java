package by.itacademy.lecture14.synchronizer.phaser;

import static by.itacademy.lecture14.synchronizer.phaser.PhaserExample.PHASER;

public class Passenger implements Runnable {

    private static String SPACE = "    ";

    private int id;
    private int departure;
    private int destination;

    public Passenger(int id, int departure, int destination) {
        this.id = id;
        this.departure = departure;
        this.destination = destination;
        System.out.println(this + " ждёт на станции " + departure);
    }

    public int getDeparture() {
        return departure;
    }

    @Override
    public void run() {
        try {
            System.out.println(SPACE + this + " вошел в вагон");

            // Заявляем об участии и ждем станции назначения
            while (PHASER.getPhase() < destination) {
                PHASER.arriveAndAwaitAdvance();
            }

            Thread.sleep(500);
            System.out.println(SPACE + this + " вышел из вагона ");

            // Отмена регистрации
            PHASER.arriveAndDeregister();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Пассажир " + id +
                " {" + departure + " -> " + destination + '}';
    }
}
