// ============================================================================
//  File          : NaiveDigitCounter
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
public class NaiveDigitCounter implements DigitCounter {
    @Override
    public int count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
