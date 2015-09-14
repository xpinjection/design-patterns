// ============================================================================
//  File          : SingletonClient
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.singleton.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class SingletonClient implements NamedService {
    public static void main(String[] args) {
        new SingletonClient().start();
    }

    public void start() {
        ServiceRegistry.getInstance().register(this);
    }

    @Override
    public String getName() {
        return "MAIN";
    }
}
