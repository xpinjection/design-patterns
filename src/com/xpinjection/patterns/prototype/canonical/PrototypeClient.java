package com.xpinjection.patterns.prototype.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class PrototypeClient {
    public static void main(String[] args) {
        Editor editor = new Editor();

        Circle circle = editor.addCircle();
        circle.changeRadix(5);

        Rectangle rectangle = editor.addRectangle();
        rectangle.changeSize(1, -1);
    }
}
