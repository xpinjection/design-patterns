// ============================================================================
//  File          : AreaVisitor
//  Created       : 13.09.2016   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2016 XP Injection, Ukraine
// ============================================================================
package com.xpinjection.patterns.visitor.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class AreaVisitor implements Visitor<Double> {
    @Override
    public Double visit(Square element) {
        return element.getSide() * element.getSide();
    }

    @Override
    public Double visit(Circle element) {
        return Math.PI * element.getRadius() * element.getRadius();
    }

    @Override
    public Double visit(Rectangle element) {
        return element.getHeight() * element.getWidth();
    }
}
