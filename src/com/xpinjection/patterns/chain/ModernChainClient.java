package com.xpinjection.patterns.chain;

import com.xpinjection.patterns.chain.canonical.Request;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author Alimenkou Mikalai
 */
public class ModernChainClient {
    public static void main(String[] args) {
        Request request = new Request(5);
        chain(new ModernAuthRequestHandler(), ModernChainClient::log)
                .accept(request);
    }

    @SafeVarargs
    public static Consumer<Request> chain(Consumer<Request>... handlers) {
        return Stream.of(handlers)
                .reduce(Consumer::andThen)
                .get();
    }

    private static void log(Request request) {
        System.out.println("Request arrived: " + request);
    }
}
