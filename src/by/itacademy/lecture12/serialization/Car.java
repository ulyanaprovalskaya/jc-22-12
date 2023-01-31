package by.itacademy.lecture12.serialization;

import java.io.Serializable;
import java.math.BigDecimal;

public class Car implements Serializable {

    static final long serialVersionUID = 12345678910L;

    private String producer;
    private String model;
    private BigDecimal price;
    private int yearOfIssue;

    public Car(String producer, String model, BigDecimal price) {
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("producer='").append(producer).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", price=").append(price);
        sb.append(", yearOfIssue=").append(yearOfIssue);
        sb.append('}');
        return sb.toString();
    }
}
