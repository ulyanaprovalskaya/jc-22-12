package by.itacademy.lecture14.synchronizer.semophore;

import java.util.concurrent.Semaphore;

public class ControlDistrict {

    public static final int CONTROL_PLACES_COUNT = 5;
    public static final int RIDERS_COUNT = 7;
    public static final boolean[] CONTROL_PLACES = new boolean[CONTROL_PLACES_COUNT];

    // флаг очередности fair=true (очередь, first_in-first_out)
    public static final Semaphore SEMAPHORE = new Semaphore(CONTROL_PLACES_COUNT, true);

    public static void main(String[] args) {
        // Флаги мест контроля [true-свободно, false-занято]
        for (int i = 0; i < CONTROL_PLACES_COUNT; i++) {
            CONTROL_PLACES[i] = true;
        }

        for (int i = 1; i <= RIDERS_COUNT; i++) {
            new Thread(new Rider(i)).start();
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
