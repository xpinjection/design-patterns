// ============================================================================
//  File          : BenchmarkingDigitCounter
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.decorator.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class BenchmarkingDigitCounter implements DigitCounter {
    private final DigitCounter delegate;

    public BenchmarkingDigitCounter(DigitCounter delegate) {
        this.delegate = delegate;
    }

    @Override
    public int count(String str) {
        long startTime = System.currentTimeMillis();
        int count = delegate.count(str);
        long endTime = System.currentTimeMillis();
        System.out.println("Counting took " + (endTime - startTime) + " ms");
        return count;
    }
}
