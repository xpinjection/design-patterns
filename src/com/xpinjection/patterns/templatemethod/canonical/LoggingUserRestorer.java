package com.xpinjection.patterns.templatemethod.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class LoggingUserRestorer extends AbstractUserRestorer {
    @Override
    protected long store(User user) {
        System.out.println("User is stored: " + user);
        return System.currentTimeMillis();
    }
}
