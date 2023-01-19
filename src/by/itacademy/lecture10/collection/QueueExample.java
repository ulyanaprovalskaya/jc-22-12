package by.itacademy.lecture10.collection;

import by.itacademy.lecture10.comparable.Car;
import by.itacademy.lecture10.comparable.CarComparator;
import java.math.BigDecimal;
import java.util.*;

public class QueueExample {

    public static void main(String[] args) {
        Car bmw = new Car("X5", "BMW", new BigDecimal(1000));
        Car mercedes = new Car("Benz", "Mercedes", new BigDecimal(1500));
        Car renault = new Car("Logan", "Renault", new BigDecimal(500));

        Queue<Car> cars = new PriorityQueue<>(new CarComparator());
        cars.offer(renault);
        cars.offer(mercedes);
        cars.offer(bmw);

        int size = cars.size();
        for(int i = 0; i < size; i++) {
            System.out.println(cars.poll());
        }

        Deque<Car> carDeque = new ArrayDeque<>(3);
        carDeque.offerFirst(bmw);
        carDeque.offerLast(mercedes);
        carDeque.offerFirst(renault);

        int dequeSize = carDeque.size();
        for(int i = 0; i < dequeSize; i++) {
            System.out.println(carDeque.pollLast());
        }
    }
}
