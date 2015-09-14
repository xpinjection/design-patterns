// ============================================================================
//  File          : ModernObserverClient
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.observer;

import com.xpinjection.patterns.observer.canonical.Event;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
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
