package by.itacademy.lecture20.builder;

import java.util.List;

public class PizzaBuilderApplication {

    public static void main(String[] args) {
        Pizza pizzaMargarita = new Pizza();
        pizzaMargarita.setDoughType("Тонкое");
        pizzaMargarita.setCheese("Моцарелла");
        pizzaMargarita.setVegetables(List.of("Томаты"));
        pizzaMargarita.setSauce("Томатный");
        pizzaMargarita.setAdditions(List.of("Орегано"));

        Pizza pizzaMargarita2 = new PizzaBuilder()
                .doughType("Тонкое")
                .cheese("Моцарелла")
                .vegetable("Томаты")
                .sauce("Томатный")
                .addition("Орегано")
                .build();

        Pizza customPizza = new PizzaBuilder()
                .doughType("Тонкое")
                .cheese("Моцарелла")
                .vegetable("Томаты")
                .vegetable("Маслины")
                .vegetable("Брокколи")
                .sauce("Томатный")
                .build();

        System.out.println(pizzaMargarita);
        System.out.println(pizzaMargarita2);
        System.out.println(customPizza);

    }
}
