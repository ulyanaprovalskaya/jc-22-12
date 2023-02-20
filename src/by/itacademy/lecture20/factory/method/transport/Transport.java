package by.itacademy.lecture20.factory.method.transport;

public abstract class Transport {

    private String id;
    private int capacity;

    public Transport(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }
}
