package com.xpinjection.patterns.visitor.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class Circle implements Element {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
