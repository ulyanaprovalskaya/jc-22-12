package by.itacademy.lecture20.factory.abstractfactory.factory;

import by.itacademy.lecture20.factory.abstractfactory.cars.base.Cabriolet;
import by.itacademy.lecture20.factory.abstractfactory.cars.base.Truck;

public class MercedesFactory implements TruckFactory, CabrioletFactory {

    @Override
    public Cabriolet produceCabriolet() {
        return null;
    }

    @Override
    public Truck produceTruck() {
        return null;
    }
}
