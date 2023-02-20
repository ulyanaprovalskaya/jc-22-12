package by.itacademy.lecture20.factory.method.service;

import by.itacademy.lecture20.factory.method.transport.Car;
import by.itacademy.lecture20.factory.method.transport.Transport;

public class CarTransportationService implements TransportationService{

    @Override
    public Transport createTransport() {
        return new Car("1", 120, "kkvsdl");
    }

    @Override
    public void makeRequest(Transport transport) {
        // ...
    }
}
