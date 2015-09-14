// ============================================================================
//  File          : UserFactory
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
public interface DocumentFactory {
    Document create(String name);
}
