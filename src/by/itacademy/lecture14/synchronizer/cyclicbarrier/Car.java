package by.itacademy.lecture14.synchronizer.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import static by.itacademy.lecture14.synchronizer.cyclicbarrier.FerryBarrier.ferryBarrier;

public class Car implements Runnable {

    private final int number;

    public Car(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            System.out.printf("К переправе подъехал автомобиль %d\n", number);
            ferryBarrier.await();

            System.out.printf("Автомобиль %d продолжил движение\n", number);
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println(e.getMessage());
        }

    }
}
