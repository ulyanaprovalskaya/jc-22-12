package by.itacademy.lecture20.factory.method.transport;

public class Car extends Transport{

    private String uniqueField;

    public Car(String id, int capacity, String uniqueField) {
        super(id, capacity);
        this.uniqueField = uniqueField;
    }
}
