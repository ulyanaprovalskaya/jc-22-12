package by.itacademy.lecture14.synchronizer.semophore;

import static by.itacademy.lecture14.synchronizer.semophore.ControlDistrict.*;

public class Rider extends Thread {

    private final int number;

    public Rider(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.printf("Всадник %d подошел к зоне контроля\n", number);
        try {
            SEMAPHORE.acquire();

            System.out.printf("\tвсадник %d проверяет наличие свободного контроллера\n", number);
            int controlNumber = findFreeControlSpot();

            // Время проверки лошади и всадника
            Thread.sleep((int) (Math.random() * 10 + 1) * 1000);

            synchronized (CONTROL_PLACES) {
                CONTROL_PLACES[controlNumber] = true;
            }

            SEMAPHORE.release();
            System.out.printf("Всадник %d завершил проверку\n", number);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private int findFreeControlSpot() {
        int controlNumber = -1;

        synchronized (CONTROL_PLACES) {
            for (int i = 0; i < CONTROL_PLACES_COUNT; i++) {
                if (CONTROL_PLACES[i]) {
                    CONTROL_PLACES[i] = false;
                    controlNumber = i;
                    System.out.printf("\t\tвсадник %d подошел к контроллеру %d.\n", number, i);
                    break;
                }
            }
        }

        return controlNumber;
    }
}
