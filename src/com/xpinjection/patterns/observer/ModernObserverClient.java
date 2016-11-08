package com.xpinjection.patterns.observer;

import com.xpinjection.patterns.observer.canonical.Event;

/**
 * @author Alimenkou Mikalai
 */
public class ModernObserverClient {
    public static void main(String[] args) {
        ModernTimeServer server = new ModernTimeServer();
        server.addListener(ModernObserverClient::log);
        server.addListener(e -> System.out.println("ANOTHER EVENT: " + e.getName()));
        server.reportTime();
        server.reportTime();
    }

    public static void log(Event event) {
        System.out.println("EVENT: " + event.getName());
    }
}
