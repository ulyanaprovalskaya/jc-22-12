package by.itacademy.lecture17.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

public class ReflectionExample {

    public static void main(String[] args) {
        Car bmw = new Car("X5", "BMW", new BigDecimal(12000));
        System.out.println(bmw);
        setObjectField(bmw, "producer", "Mercedes");
        System.out.println(bmw);
        System.out.println();

        Class<Car> carClass = Car.class;
        Field[] carFields = carClass.getDeclaredFields();
        Method[] carMethods = carClass.getDeclaredMethods();
        Constructor[] constructors = carClass.getConstructors();

        Arrays.stream(carFields)
              .forEach(System.out::println);

        Arrays.stream(carMethods)
              .forEach(System.out::println);

        System.out.println(Arrays.toString(constructors));
        System.out.println();

        createInstance(Car.class).ifPresent(System.out::println);

    }

    private static <T> Optional<T> createInstance(Class<T> classVar) {
        T object = null;
        try {
            Constructor<?> noArgsConstructor = classVar.getDeclaredConstructor();
            object = (T) noArgsConstructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            System.out.println("Error: " + e);
        }
        return Optional.ofNullable(object);
    }

    private static <T, V> void setObjectField(T object, String fieldName, V value) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Error: " + e);
        }
    }
}
