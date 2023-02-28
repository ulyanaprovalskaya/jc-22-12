package by.itacademy.lecture20.decorator.car;

public class PassengerCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Сборка легкового автомобиля");
    }
}
