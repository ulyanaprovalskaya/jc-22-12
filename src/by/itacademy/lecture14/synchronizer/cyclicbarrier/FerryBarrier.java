package by.itacademy.lecture14.synchronizer.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class FerryBarrier {

    public static final int FERRY_BOAT_SIZE = 3;
    public static CyclicBarrier ferryBarrier = new CyclicBarrier(FERRY_BOAT_SIZE, new FerryBoat());

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 10; i++) {
            new Thread(new Car(i)).start();
            Thread.sleep(400);
        }
    }
}
