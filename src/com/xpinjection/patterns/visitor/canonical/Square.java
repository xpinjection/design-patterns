package com.xpinjection.patterns.visitor.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class Square implements Element {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
