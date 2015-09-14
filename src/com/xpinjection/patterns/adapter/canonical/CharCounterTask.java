// ============================================================================
//  File          : CounterTask
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.adapter.canonical;

import java.util.concurrent.atomic.AtomicInteger;

/**
* @author Alimenkou Mikalai
* @version 1.0
*/
public class CharCounterTask implements Runnable {
    private final String str;
    private final AtomicInteger counter;

    public CharCounterTask(String str, AtomicInteger counter) {
        this.str = str;
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.addAndGet(str.length());
    }
}
