package by.itacademy.lecture10.comparable;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getProducer().compareTo(o2.getProducer());
    }
}
