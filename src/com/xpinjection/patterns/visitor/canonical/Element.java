package com.xpinjection.patterns.visitor.canonical;

/**
 * @author Alimenkou Mikalai
 */
public interface Element {
    <T> T accept(Visitor<T> visitor);
}
