package com.xpinjection.patterns.builder.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class BuilderClient {
    public static void main(String[] args) {
        Cluster cluster = Cluster.runtimeBuilder()
                .addContactPoints("localhost").withPort(3165)
                .withRetryAttempts(3)
                .withoutMetrics().build();

        cluster = Cluster.storingBuilder()
                .addContactPoints("localhost").withPort(3165)
                .withRetryAttempts(3)
                .withoutMetrics().build();
    }
}
