package com.xpinjection.patterns.observer.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class LoggingEventListener implements EventListener {
    @Override
    public void onEvent(Event event) {
        System.out.println("EVENT: " + event.getName());
    }
}
