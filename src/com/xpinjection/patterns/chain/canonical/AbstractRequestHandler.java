// ============================================================================
//  File          : AbstractRequestHandler
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
public abstract class AbstractRequestHandler implements RequestHandler {
    private final RequestHandler next;

    public AbstractRequestHandler(RequestHandler next) {
        this.next = next;
    }

    protected void passToTheNext(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }
}
