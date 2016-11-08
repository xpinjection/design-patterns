package com.xpinjection.patterns.observer.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class Event {
    private final String name;

    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
