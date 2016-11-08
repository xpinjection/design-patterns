package com.xpinjection.patterns.prototype.canonical;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alimenkou Mikalai
 */
public class Editor {
    private final List<Figure> figures = new ArrayList<>();

    private final Circle defaultCircle = new Circle(5);
    private final Rectangle defaultRectangle = new Rectangle(2, 4);

    public Circle addCircle() {
        Circle circle = defaultCircle.clone();
        figures.add(circle);
        return circle;
    }

    public Rectangle addRectangle() {
        Rectangle rectangle = defaultRectangle.clone();
        figures.add(rectangle);
        return rectangle;
    }
}
