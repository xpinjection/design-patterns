package com.xpinjection.patterns.visitor.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class PerimeterVisitor implements Visitor<Double> {
    @Override
    public Double visit(Square element) {
        return 4 * element.getSide();
    }

    @Override
    public Double visit(Circle element) {
        return 2 * Math.PI * element.getRadius();
    }

    @Override
    public Double visit(Rectangle element) {
        return (2 * element.getHeight() + 2 * element.getWidth());
    }
}
