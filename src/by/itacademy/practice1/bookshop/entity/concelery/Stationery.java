package by.itacademy.practice1.bookshop.entity.concelery;

import by.itacademy.practice1.bookshop.entity.Product;

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
