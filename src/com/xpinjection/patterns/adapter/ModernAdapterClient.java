// ============================================================================
//  File          : ModernAdapterClient
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.adapter;

import com.xpinjection.patterns.adapter.canonical.CharCounterTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Arrays.asList;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernAdapterClient {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        AtomicInteger counter = new AtomicInteger();
        asList("af", "bdf", "c").stream()
                .map(s -> new CharCounterTask(s, counter))
                .forEach(executor::execute);

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("Total count: " + counter.get());
    }
}
