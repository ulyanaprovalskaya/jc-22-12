package by.itacademy.lecture20.factory.method.service;

import by.itacademy.lecture20.factory.method.transport.Transport;

public class ShipTransportationService implements TransportationService {

    @Override
    public Transport createTransport() {
        return null;
    }

    @Override
    public void makeRequest(Transport transport) {

    }
}
