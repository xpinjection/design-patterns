// ============================================================================
//  File          : ObserverClient
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.observer.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ObserverClient {
    public static void main(String[] args) {
        TimeServer server = new TimeServer();
        server.addListener(new LoggingEventListener());
        server.reportTime();
        server.reportTime();
    }
}
