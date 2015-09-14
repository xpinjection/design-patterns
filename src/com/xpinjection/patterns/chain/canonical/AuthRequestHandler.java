// ============================================================================
//  File          : AuthRequestHandler
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
public class AuthRequestHandler extends AbstractRequestHandler {
    private static final ThreadLocal<Long> currentUser = new ThreadLocal<>();

    public AuthRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        currentUser.set(request.getUserId());
        System.out.println("Current user is set to: " + request.getUserId());
        request.addParam("AUTH_PASSED", "TRUE");
        passToTheNext(request);
    }

    public static Long getCurrentUser() {
        return currentUser.get();
    }
}
