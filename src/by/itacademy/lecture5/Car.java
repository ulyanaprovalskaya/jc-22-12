package by.itacademy.lecture5;

public class Car {

    private String model = "<модель не задана>";
    private String producer = "<производитель не задан>";
    private double price = 500000;
    private boolean isAvailable = true;

    static String className = "Car";

    public Car() {
    }

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Car(String producer, String model, double price) {
        this(producer, model);
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFullInfo() {
        return producer + " " + model + ", " + price + ", " + isAvailable;
    }

    static void showClassName() {
        System.out.println(className);
    }
}
