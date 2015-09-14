// ============================================================================
//  File          : LoggingEventListeber
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
public class LoggingEventListener implements EventListener {
    @Override
    public void onEvent(Event event) {
        System.out.println("EVENT: " + event.getName());
    }
}
