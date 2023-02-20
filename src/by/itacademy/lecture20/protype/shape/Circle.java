package by.itacademy.lecture20.protype.shape;

public class Circle extends Shape implements Cloneable {

    @Override
    public Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
