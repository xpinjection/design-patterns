// ============================================================================
//  File          : LoggingUserRestorer
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.templatemethod.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class LoggingUserRestorer extends AbstractUserRestorer {
    @Override
    protected long store(User user) {
        System.out.println("User is stored: " + user);
        return System.currentTimeMillis();
    }
}
