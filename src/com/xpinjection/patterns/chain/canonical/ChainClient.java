package com.xpinjection.patterns.chain.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class ChainClient {
    public static void main(String[] args) {
        Request request = new Request(5);
        RequestHandler handler = new AuthRequestHandler(new LoggingRequestHandler(null));
        handler.handleRequest(request);
    }
}
