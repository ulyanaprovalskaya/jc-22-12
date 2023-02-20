package by.itacademy.lecture20.builder;

import java.util.List;

public class PizzaBuilder {

    private Pizza pizza = new Pizza();

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public PizzaBuilder doughType(String doughType) {
        pizza.setDoughType(doughType);
        return this;
    }

    public PizzaBuilder sauce(String sauce) {
        pizza.setSauce(sauce);
        return this;
    }

    public PizzaBuilder meat(String meat) {
        pizza.setMeat(meat);
        return this;
    }

    public PizzaBuilder cheese(String cheese) {
        pizza.setCheese(cheese);
        return this;
    }

    public PizzaBuilder vegetable(String vegetable) {
        pizza.getVegetables().add(vegetable);
        return this;
    }

    public PizzaBuilder vegetables(List<String> vegetables) {
        pizza.getVegetables().addAll(vegetables);
        return this;
    }

    public PizzaBuilder addition(String addition) {
        pizza.getAdditions().add(addition);
        return this;
    }

    public PizzaBuilder additions(List<String> additions) {
        pizza.getAdditions().addAll(additions);
        return this;
    }

    public Pizza build() {
        try {
            return pizza.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Ошибка клонирования: " + e);
        } finally {
            pizza = new Pizza();
        }
        return null;
    }

}
