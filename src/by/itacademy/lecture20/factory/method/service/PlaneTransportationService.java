package by.itacademy.lecture20.factory.method.service;

import by.itacademy.lecture20.factory.method.transport.Plane;
import by.itacademy.lecture20.factory.method.transport.Transport;

public class PlaneTransportationService implements TransportationService {

    @Override
    public Transport createTransport() {
        return new Plane("2", 1000);
    }

    @Override
    public void makeRequest(Transport transport) {
        // ...
    }
}
