package by.itacademy.lecture7.car;

public class Truck implements Drivable {

    @Override
    public void drive() {
        System.out.println("Грузовик начниает движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void turnRight() {
        Drivable.prepareForTurn();
        System.out.println("Грузовик поворочивает направо");
    }
}
