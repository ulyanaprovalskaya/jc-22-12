package by.itacademy.lecture20.decorator.car;

public class DecoratorApplication {

    public static void main(String[] args) {
        Car passengerCar = new PassengerCar();
        passengerCar.assemble();

        Car truck = new Truck();
        truck.assemble();

        Car electroTruck = new ElectroCarDecorator(truck);
        electroTruck.assemble();

        Car electroPassengerCar = new ElectroCarDecorator(passengerCar);
        electroPassengerCar.assemble();
    }
}
