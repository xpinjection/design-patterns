// ============================================================================
//  File          : Circle
//  Created       : 12.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.prototype.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class Circle implements Figure {
    private int radix;

    public Circle(int radix) {
        this.radix = radix;
    }

    public void changeRadix(int delta) {
        radix += delta;
    }

    @Override
    public double getSquare() {
        return Math.PI * radix * radix;
    }

    @Override
    public Circle clone() {
        return new Circle(radix);
    }
}
