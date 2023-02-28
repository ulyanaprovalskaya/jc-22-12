package by.itacademy.lecture20.composite;

import by.itacademy.lecture20.composite.drawable.*;
import java.util.List;

public class CompositeApplication {

    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();


        CompoundShape circlePlusRectangle = new CompoundShape(List.of(circle, rectangle));
        CompoundShape circlePlusTriangle = new CompoundShape(List.of(circle, triangle));
        CompoundShape allShapes = new CompoundShape(List.of(circlePlusRectangle, triangle));

        circlePlusRectangle.draw();
        System.out.println();
        circlePlusTriangle.draw();
        System.out.println();
        allShapes.draw();
    }
}
