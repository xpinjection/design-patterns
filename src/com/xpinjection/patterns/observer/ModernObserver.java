package com.xpinjection.patterns.observer;

import com.xpinjection.patterns.observer.canonical.Event;

import java.util.function.Consumer;

/**
 * @author Alimenkou Mikalai
 */
public interface ModernObserver {
    void addListener(Consumer<Event> listener);
}
