package by.itacademy.lecture15;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String str = "Hello world!";

        Optional<String> helloOptional = Optional.of(str);
        Optional<String> helloOptionalOfNullable = Optional.ofNullable(null);
        Optional<String> optionalEmpty = Optional.empty();

        System.out.println(optionalEmpty.orElse("Empty :("));
        System.out.println(helloOptional.orElseGet(OptionalExample::getString));
        //System.out.println(optionalEmpty.orElseThrow(() -> new RuntimeException("Optional was empty!!!!")));
        optionalEmpty
                .ifPresent(hello ->  System.out.println("String length: " + hello.length()));

        System.out.println(helloOptional.map(String::length).orElse(0));
        System.out.println(helloOptional.filter(s -> !s.isEmpty()).orElse(""));
    }

    private static String getString() {
        //
        return "some string";
    }

}
