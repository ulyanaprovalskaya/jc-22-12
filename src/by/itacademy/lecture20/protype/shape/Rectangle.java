package by.itacademy.lecture20.protype.shape;

public class Rectangle extends Shape implements Cloneable {

    @Override
    public Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
