package by.itacademy.lecture7.animal;

public class Animal {

    protected String color;
    protected String name;

    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void makeSound() {
        System.out.println("животное издает звук");
    }

    public String getInfo() {
        return String.format("Животное: %s, %s", color, name);
    }
}
