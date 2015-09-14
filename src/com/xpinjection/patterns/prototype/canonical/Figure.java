// ============================================================================
//  File          : Figure
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
public interface Figure {
    double getSquare();

    Figure clone();
}
