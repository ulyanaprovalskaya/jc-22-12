package by.itacademy.lecture11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class ExceptionExample {

    public static void main(String[] args) {
        Car bmw = new Car("X5", "BMW", new BigDecimal(400));

        try {
            System.out.println(bmw.clone());
        } catch (Exception e) {
            System.out.println("Произошла ошибка при клонирования");
        } finally {
            System.out.println("Блок finally");
        }


        int[] numbers = new int[10];
        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) { // i <= length для ArrayIndexOutOfBoundsException
            numbers[i] = r.nextInt(100);
            System.out.println(numbers[i]);
        }

        try {
            System.out.println(1 / 0); // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("На нуль делить нельзя!");
        }

        //Car car = getCar(bmw); // null
        // System.out.println(car.getProducer()); NullPointerException

        String abc = "abc";
        //System.out.println(Integer.parseInt(abc)); // NumberFormatException

        //printNumber(1);

        //OutOfMemoryError
        /*List<Object[]> arrays = new ArrayList<>();
        for (; ; ) {
            arrays.add(new Object[100]);
        }*/

        CarShowroom carShowroom = new CarShowroom(new ArrayList<>());
        System.out.println(carShowroom.getCars());
    }

    private static Car getCar(Car car) throws CloneNotSupportedException {
        if (car.getProducer().equals("Mercedes")) {
            return car.clone();
        }
        return null;
    }

    // StackOverflowError
    private static int printNumber(int x) {
        System.out.println(x);
        return x + printNumber(x + 2);
    }

}
