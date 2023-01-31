package by.itacademy.lecture14.synchronizer.cyclicbarrier;

public class FerryBoat implements Runnable {

    @Override
    public void run() {
        try {
            // Задержка на переправе
            System.out.println("\nЗагрузка автомобилей");
            Thread.sleep(500);
            System.out.println("Паром переправил автомобили\n");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
