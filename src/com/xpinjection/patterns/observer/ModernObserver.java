// ============================================================================
//  File          : ModernObserver
//  Created       : 13.09.2016   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2016 XP Injection, Ukraine
// ============================================================================
package com.xpinjection.patterns.observer;

import com.xpinjection.patterns.observer.canonical.Event;

import java.util.function.Consumer;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public interface ModernObserver {
    void addListener(Consumer<Event> listener);
}
