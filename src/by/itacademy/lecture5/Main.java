package by.itacademy.lecture5;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car("", "X5", 100000.0);
        Car emptyCar = new Car();
        System.out.println(emptyCar.getFullInfo());



        Car.showClassName();
    }

}
