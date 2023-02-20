package by.itacademy.lecture20.factory.method.service;

import by.itacademy.lecture20.factory.method.transport.Transport;

public interface TransportationService {

    Transport createTransport();

    void makeRequest(Transport transport);
}
