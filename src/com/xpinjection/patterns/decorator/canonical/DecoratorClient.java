package com.xpinjection.patterns.decorator.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class DecoratorClient {
    public static void main(String[] args) {
        DigitCounter counter = new BenchmarkingDigitCounter(new NaiveDigitCounter());
        int digitsCount = counter.count("fd6j78fh19kj");
        System.out.println(digitsCount + " digits found");
    }
}
