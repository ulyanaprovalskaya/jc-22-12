package by.itacademy.lecture7.animal;

public class Cat extends Animal {

    private String breed;

    public Cat(String color, String name, String breed) {
        super(color, name);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Мяу");
    }

    public String getInfo() {
        return super.getInfo() + ", " + breed;
        /*return String.format("Кот: %s, %s, %s", super.color, super.name, breed);*/
    }
}
