package com.xpinjection.patterns.factorymethod.canonical;

/**
 * @author Alimenkou Mikalai
 */
public interface Document {
    String getName();

    void addField(String name, String value);

    String toString();
}
