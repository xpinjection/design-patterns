package com.xpinjection.patterns.prototype.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class Rectangle implements Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void changeSize(int widthDelta, int heightDelta) {
        width += widthDelta;
        height += heightDelta;
    }

    @Override
    public double getSquare() {
        return width * height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(width, height);
    }
}
