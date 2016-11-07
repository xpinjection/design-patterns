// ============================================================================
//  File          : LombokBuilderClient
//  Created       : 07.11.2016   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2016 XP Injection, Ukraine
// ============================================================================
package com.xpinjection.patterns.builder;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class LombokBuilderClient {
    public static void main(String[] args) {
        LombokCluster cluster = LombokCluster.builder()
                .host("localhost").port(3165)
                .retryAttempts(3).metricsEnabled(false).build();
    }
}
