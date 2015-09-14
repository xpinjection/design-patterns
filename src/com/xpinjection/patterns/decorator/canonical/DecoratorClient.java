// ============================================================================
//  File          : DecoratorClient
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
public class DecoratorClient {
    public static void main(String[] args) {
        DigitCounter counter = new BenchmarkingDigitCounter(new NaiveDigitCounter());
        int digitsCount = counter.count("fd6j78fh19kj");
        System.out.println(digitsCount + " digits found");
    }
}
