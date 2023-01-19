package by.itacademy.lecture10.collection;

import by.itacademy.lecture10.comparable.Car;
import by.itacademy.lecture10.comparable.Owner;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Car bmw = new Car("X5", "BMW", new BigDecimal(1000));
        Car mercedes = new Car("Benz", "Mercedes", new BigDecimal(1500));
        Car renault = new Car("Logan", "Renault", new BigDecimal(500));

        Owner bmwOwner = new Owner("Иван", "Иванов", 2);
        Owner mercedesOwner = new Owner("Мария", "Смирнова", 5);
        Owner renaultOwner = new Owner("Сергей", "Петров", 1);

        Map<Owner, Car> carMap = new HashMap<>();
        carMap.put(bmwOwner, bmw);
        carMap.put(mercedesOwner, mercedes);
        carMap.put(renaultOwner, renault);

        for(Map.Entry<Owner, Car> entry : carMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
