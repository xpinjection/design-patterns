// ============================================================================
//  File          : ChainClient
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
public class ChainClient {
    public static void main(String[] args) {
        Request request = new Request(5);
        RequestHandler handler = new AuthRequestHandler(new LoggingRequestHandler(null));
        handler.handleRequest(request);
    }
}
