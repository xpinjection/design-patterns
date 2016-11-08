package com.xpinjection.patterns.decorator.canonical;

/**
 * @author Alimenkou Mikalai
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
