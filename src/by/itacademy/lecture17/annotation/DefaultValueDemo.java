package by.itacademy.lecture17.annotation;

import by.itacademy.lecture17.reflection.Car;

public class DefaultValueDemo {

    public static void main(String[] args) {
        Car car = new Car();

        DefaultValueAnnotationHandler defaultValueAnnotationHandler = new DefaultValueAnnotationHandler();
        defaultValueAnnotationHandler.handle(car);

        System.out.println(car);
    }
}
