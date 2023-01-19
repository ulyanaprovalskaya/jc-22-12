package by.itacademy.lecture10.collection;

import by.itacademy.lecture10.comparable.Car;
import java.math.BigDecimal;
import java.util.*;

public class SetExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car bmw = new Car("X5", "BMW", new BigDecimal(1000));
        Car mercedes = new Car("Benz", "Mercedes", new BigDecimal(1500));
        Car renault = new Car("Logan", "Renault", new BigDecimal(500));

        Set<Car> carSet = new HashSet<>();
        carSet.add(bmw);
        carSet.add(mercedes);
        carSet.add(renault);
        boolean result = carSet.add(bmw.clone());

        System.out.println("Результат добавления в carSet клона BMW: " + result);

        /*
            хэш-код - значение

            bmw.hashCode() - bmw
            mercedes.hashCode() - mercedes
            renault.hashCode() - renault
        */

        Random random = new Random(30);
        SortedSet<Integer> numberSet = new TreeSet<>();

        for(int i = 0; i < 1000; i++) {
            int number = random.nextInt(10);
            if(numberSet.add(number)){
                System.out.print(number);
            }
        }

        System.out.println();
        System.out.println(numberSet);
    }
}
