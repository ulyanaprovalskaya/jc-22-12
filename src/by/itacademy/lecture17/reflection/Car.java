package by.itacademy.lecture17.reflection;

import by.itacademy.lecture17.annotation.DefaultValue;
import java.math.BigDecimal;

public class Car {

    @DefaultValue("не задана")
    private String model;

    @DefaultValue("нет")
    private String producer;

    private BigDecimal price;

    public Car() {
    }

    public Car(String model, String producer, BigDecimal price) {
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public BigDecimal getPrice() {
        return price;
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
}
