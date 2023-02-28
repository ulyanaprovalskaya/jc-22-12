package by.itacademy.lecture20.decorator.car;

public class ElectroCarDecorator implements Car{

    private Car car;

    public ElectroCarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        System.out.println("Сборка электро авто над существующим");
        car.assemble();
    }
}
