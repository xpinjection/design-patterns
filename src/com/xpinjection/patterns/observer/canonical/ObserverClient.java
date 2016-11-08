package com.xpinjection.patterns.observer.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class ObserverClient {
    public static void main(String[] args) {
        TimeServer server = new TimeServer();
        server.addListener(new LoggingEventListener());
        server.reportTime();
        server.reportTime();
    }
}
