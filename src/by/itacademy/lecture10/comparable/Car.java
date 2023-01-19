package by.itacademy.lecture10.comparable;

import java.math.BigDecimal;
import java.util.Objects;

public class Car implements Comparable<Car>, Cloneable {

    private String model;
    private String producer;
    private BigDecimal price;

    public Car(String model, String producer, BigDecimal price) {
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public int compareTo(Car o) {
        return price.compareTo(o.price);
        /*if (this.price < o.price) {
            return 1;
        } else if (this.price > o.price) {
            return -1;
        } else {
            return 0;
        }*/
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", producer='").append(producer).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(model, car.model) &&
                Objects.equals(producer, car.producer) &&
                Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, price);
    }
}
