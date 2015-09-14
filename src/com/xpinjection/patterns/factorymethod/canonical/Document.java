// ============================================================================
//  File          : Document
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.factorymethod.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public interface Document {
    String getName();

    void addField(String name, String value);

    String toString();
}
