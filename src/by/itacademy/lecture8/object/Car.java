package by.itacademy.lecture8.object;

import java.util.Objects;

public class Car implements Cloneable {

    private String model;
    private String producer;
    private int price;
    private Owner owner;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Car)) {
            return false;
        }

        Car car = (Car) obj;
        return model.equals(car.model) &&
                producer.equals(car.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer);
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car clonedCar = (Car) super.clone();

        Owner clonedOwner = new Owner();
        clonedOwner.setFirstName(owner.getFirstName());
        clonedOwner.setLastName(owner.getLastName());
        clonedOwner.setBirthDate(owner.getBirthDate());

        clonedCar.setOwner(clonedOwner);

        return clonedCar;
    }

    @Override
    public String toString() {
        return String.format("Автомобиль: %s %s, %d. %s", producer, model, price, owner);
    }
}
