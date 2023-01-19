package by.itacademy.lecture10.comparable;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class ComparableExample {

    public static void main(String[] args) {
        Car bmw = new Car("X5", "BMW", new BigDecimal(1000));
        Car mercedes = new Car("Benz", "Mercedes", new BigDecimal(1500));
        Car renault = new Car("Logan", "Renault", new BigDecimal(500));

        Car[] cars = new Car[]{bmw, mercedes, renault};

        System.out.println("До сортировки: " + Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println("После сортировки: " + Arrays.toString(cars));

        Comparator<Car> carComparator = new Comparator<>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getProducer().compareTo(o2.getProducer());
            }
        };

        Arrays.sort(cars, carComparator);
        System.out.println("Сортировка компаратором: " + Arrays.toString(cars));
    }
}
