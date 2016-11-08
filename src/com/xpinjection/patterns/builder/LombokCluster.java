package com.xpinjection.patterns.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

/**
 * @author Alimenkou Mikalai
 */
@Builder
@Getter
public class LombokCluster {
    @Singular private List<String> hosts;
    private int port;
    private int retryAttempts;
    private boolean metricsEnabled;
}
