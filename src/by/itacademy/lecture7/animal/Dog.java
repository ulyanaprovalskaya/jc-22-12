package by.itacademy.lecture7.animal;

public class Dog extends Animal {

    public Dog(String color, String name) {
        super(color, name);
    }

    public void makeSound() {
        System.out.println("Гав");
    }
}
