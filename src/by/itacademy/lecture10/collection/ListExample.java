package by.itacademy.lecture10.collection;

import by.itacademy.lecture10.comparable.Car;
import java.math.BigDecimal;
import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        Car bmw = new Car("X5", "BMW", new BigDecimal(1000));
        Car mercedes = new Car("Benz", "Mercedes", new BigDecimal(1500));
        Car renault = new Car("Logan", "Renault", new BigDecimal(500));

        List<Car> cars = new ArrayList<>();
        cars.add(bmw);
        cars.add(mercedes);
        cars.add(renault);

        cars = new LinkedList<>();

        System.out.println(cars);

        List<Car> carsLinkedList = new LinkedList<>();
        for (Car car : carsLinkedList) {
            System.out.println(car);
        }
    }
}
