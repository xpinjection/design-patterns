// ============================================================================
//  File          : LombokCluster
//  Created       : 07.11.2016   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2016 XP Injection, Ukraine
// ============================================================================
package com.xpinjection.patterns.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
@Builder
@Getter
public class LombokCluster {
    @Singular private List<String> hosts;
    private int port;
    private int retryAttempts;
    private boolean metricsEnabled;
}
