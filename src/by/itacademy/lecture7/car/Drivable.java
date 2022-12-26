package by.itacademy.lecture7.car;

public interface Drivable {

    void drive();

    void stop();

    void turnRight();

    static void prepareForTurn() {
        System.out.println("Готовится к повороту..");
    }
}
