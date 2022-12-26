package by.itacademy.lecture7;

import by.itacademy.lecture7.car.Drivable;
import by.itacademy.lecture7.car.PassengerCar;
import by.itacademy.lecture7.car.Truck;

public class Main {

    private static final String PI = "3.14";

    public static void main(String[] args) {
        Drivable car = new PassengerCar();
        car.drive();

        Drivable truck = new Truck();
        truck.drive();

        car.turnRight();

        truck.stop();
        car.stop();

        int x = 4;
        if (x == 3)
            System.out.println(1);

        System.out.println(2);

        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
