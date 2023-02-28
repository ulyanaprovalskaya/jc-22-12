package by.itacademy.lecture20.decorator.car;

public class Truck implements Car {

    @Override
    public void assemble() {
        System.out.println("Сборка грузового авто");
    }
}
