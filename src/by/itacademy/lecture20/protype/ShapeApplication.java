package by.itacademy.lecture20.protype;

import by.itacademy.lecture20.protype.shape.Circle;
import by.itacademy.lecture20.protype.shape.Rectangle;

public class ShapeApplication {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circleCopy = circle.clone();

        Rectangle rectangle = new Rectangle();
        Rectangle rectangleCopy = rectangle.clone();
    }
}
