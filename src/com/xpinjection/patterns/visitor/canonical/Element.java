// ============================================================================
//  File          : Element
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
public interface Element {
    <T> T accept(Visitor<T> visitor);
}
