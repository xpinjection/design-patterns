// ============================================================================
//  File          : TimeObserver
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.observer.canonical;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class TimeServer implements Observer {
    private static final String TIME_FORMAT = "HH:mm:ss";

    private final List<EventListener> listeners = new ArrayList<>();

    @Override
    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    public void reportTime() {
        Event event = new Event(new SimpleDateFormat(TIME_FORMAT).format(new Date()));
        for (EventListener listener : listeners) {
            listener.onEvent(event);
        }
    }
}
