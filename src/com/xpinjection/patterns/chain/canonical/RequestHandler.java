// ============================================================================
//  File          : RequestHandler
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.chain.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public interface RequestHandler {
    void handleRequest(Request request);
}
