package by.itacademy.lecture20.factory.abstractfactory.factory;

import by.itacademy.lecture20.factory.abstractfactory.cars.base.Cabriolet;
import by.itacademy.lecture20.factory.abstractfactory.cars.base.Sedan;
import by.itacademy.lecture20.factory.abstractfactory.cars.base.Truck;

public class BmwFactory implements TruckFactory, CabrioletFactory, SedanFactory {

    @Override
    public Cabriolet produceCabriolet() {
        return null;
    }

    @Override
    public Sedan produceSedan() {
        return null;
    }

    @Override
    public Truck produceTruck() {
        return null;
    }
}
