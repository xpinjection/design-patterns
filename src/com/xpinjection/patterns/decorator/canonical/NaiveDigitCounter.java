package com.xpinjection.patterns.decorator.canonical;

/**
 * @author Alimenkou Mikalai
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
