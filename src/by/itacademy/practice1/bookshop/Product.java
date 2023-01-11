package by.itacademy.practice1.bookshop;

import java.math.BigDecimal;

public abstract class Product {

    protected BigDecimal price;
    protected int availableAmount;

    public void buy() {
        availableAmount--;
    }
}
