package by.itacademy.lecture15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("John");
        names.add("John");
        names.add("Ivan");
        names.add("Ivan");

        Optional<String> first =
                names.stream()
                     .filter(s -> s.length() < 5)
                     .sorted()
                     .distinct()
                     .findFirst();

        System.out.println(first);
    }
}
