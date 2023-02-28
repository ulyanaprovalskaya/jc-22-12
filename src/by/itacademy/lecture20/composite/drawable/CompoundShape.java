package by.itacademy.lecture20.composite.drawable;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Drawable {

    private List<Drawable> drawables;

    public CompoundShape(List<Drawable> drawables) {
        this.drawables = drawables;
    }

    @Override
    public void draw() {
        System.out.println("Сложная фигура:");
        drawables.forEach(Drawable::draw);
    }
}
