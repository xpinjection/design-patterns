package com.xpinjection.patterns.visitor.canonical;

/**
 * @author Alimenkou Mikalai
 */
public interface Visitor<T> {
    T visit(Square element);

    T visit(Circle element);

    T visit(Rectangle element);
}
