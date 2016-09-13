// ============================================================================
//  File          : Visitor
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
public interface Visitor<T> {
    T visit(Square element);

    T visit(Circle element);

    T visit(Rectangle element);
}
