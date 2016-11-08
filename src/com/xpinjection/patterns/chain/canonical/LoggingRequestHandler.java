package com.xpinjection.patterns.chain.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class LoggingRequestHandler extends AbstractRequestHandler {
    public LoggingRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("Request arrived: " + request);
        passToTheNext(request);
    }
}
