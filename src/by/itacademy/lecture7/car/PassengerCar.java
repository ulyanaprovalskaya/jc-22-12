package by.itacademy.lecture7.car;

public class PassengerCar implements Drivable {

    @Override
    public void drive() {
        System.out.println("Легковая машина начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Легковая машина остановилась");
    }

    @Override
    public void turnRight() {
        Drivable.prepareForTurn();
        System.out.println("Легковая машина поворачивает направо");
    }
}
