package by.itacademy.lecture15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        runFunctionExample();
    }

    private static void runFunctionExample() {
        Function<String, Integer> numberConverter = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        System.out.println(numberConverter.apply("1"));
        System.out.println(numberConverter.apply("123"));
        System.out.println(numberConverter.apply("-3456"));
    }

    private void runSupplierExample() {
        List<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("John");
        names.add("Ivan");

        Supplier<String> randomNameSupplier = () -> {
            int index = (int) (Math.random() * names.size());
            return names.get(index);
        };

        System.out.println(randomNameSupplier.get());
        System.out.println(randomNameSupplier.get());
        System.out.println(randomNameSupplier.get());
    }

    private static void runConsumerExample() {
        Consumer<String> greetingConsumer = s -> System.out.println("Hello, " + s);

        greetingConsumer.accept("John");
        greetingConsumer.accept("Ivan");
        greetingConsumer.accept("Maria");
    }

    private static void runPredicateExample() {
        Predicate<Integer> isEvenPredicate = a -> a % 2 == 0;

        System.out.println(isEvenPredicate.test(2));
        System.out.println(isEvenPredicate.test(3));
        System.out.println(isEvenPredicate.test(4));
    }
}
