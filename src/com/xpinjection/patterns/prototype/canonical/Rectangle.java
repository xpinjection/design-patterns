// ============================================================================
//  File          : Square
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
public class Rectangle implements Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void changeSize(int widthDelta, int heightDelta) {
        width += widthDelta;
        height += heightDelta;
    }

    @Override
    public double getSquare() {
        return width * height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(width, height);
    }
}
