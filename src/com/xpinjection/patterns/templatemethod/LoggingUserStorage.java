package com.xpinjection.patterns.templatemethod;

import com.xpinjection.patterns.templatemethod.canonical.User;

/**
 * @author Alimenkou Mikalai
 */
public class LoggingUserStorage {
    public long store(User user) {
        System.out.println("User is stored: " + user);
        return System.currentTimeMillis();
    }
}
