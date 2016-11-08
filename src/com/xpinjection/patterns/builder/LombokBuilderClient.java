package com.xpinjection.patterns.builder;

/**
 * @author Alimenkou Mikalai
 */
public class LombokBuilderClient {
    public static void main(String[] args) {
        LombokCluster cluster = LombokCluster.builder()
                .host("localhost").port(3165)
                .retryAttempts(3).metricsEnabled(false).build();
    }
}
