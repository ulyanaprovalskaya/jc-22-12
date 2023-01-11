package by.itacademy.practice1.bookshop.concelery;

import by.itacademy.practice1.bookshop.Product;

public abstract class Stationery extends Product {

    private String color;

    public String getColor() {
        return color;
    }

    @Override
    public void buy() {
        availableAmount--;
    }
}
