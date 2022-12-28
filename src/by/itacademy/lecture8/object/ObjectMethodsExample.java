package by.itacademy.lecture8.object;

public class ObjectMethodsExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        //owners
        Owner bmwOwner = new Owner("Иван", "Иванов", "01.05.1990");
        Owner mercedesOwner = new Owner("Мария", "Ильина", "15.11.1985");

        // cars
        Car bmw1 = new Car("X5", "BMW");
        bmw1.setPrice(1000);
        bmw1.setOwner(bmwOwner);
        Car bmw2 = new Car("X5", "BMW");
        Car bmw3 = bmw1.clone();
        Car mercedes = new Car("Benz", "Mercedes");

        System.out.println("bmw3: " + bmw3);
        System.out.println("bmw1: " + bmw1);
        System.out.println(bmw1.getOwner() == bmw3.getOwner());

        bmw3.setPrice(1500);
        bmw3.getOwner().setFirstName("Алексей");
        System.out.println("bmw3: " + bmw3);
        System.out.println("bmw1: " + bmw1);

        //System.out.println(bmw); // ~ System.out.println(bmwSystem.out.println(bmw.toString()))
    }
}
