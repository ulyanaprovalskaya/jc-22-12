package by.itacademy.lecture2;

public class Main {

    public static void main(String[] args) {
        int a = 100;
        System.out.println(isEven(a));
        System.out.println(a);

        boolean result = isEven(a);
        printHello();
        printHello("Вася");
        printHello(2);
    }

    public static boolean isEven(int number) {
        number++;
        return number % 2 == 0 && number != 0;
    }

    public static void printHello() {
        System.out.println("Hello");
    }

    public static void printHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void printHello(int number) {

    }
}
