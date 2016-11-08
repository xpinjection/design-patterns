package com.xpinjection.patterns.templatemethod.canonical;

import java.util.StringTokenizer;

/**
 * @author Alimenkou Mikalai
 */
public abstract class AbstractUserRestorer {
    private static final String DELIMITER = ":";

    public User restore(String serialized) {
        StringTokenizer tokenizer = new StringTokenizer(serialized, DELIMITER);
        validate(tokenizer);
        User user = parse(tokenizer);
        long id = store(user);
        user.setId(id);
        return user;
    }

    private User parse(StringTokenizer tokenizer) {
        String name = tokenizer.nextToken();
        int age = Integer.parseInt(tokenizer.nextToken());
        return new User(name, age);
    }

    private void validate(StringTokenizer tokenizer) {
        if (tokenizer.countTokens() != 2) {
            throw new IllegalArgumentException("Invalid data format!");
        }
    }

    protected abstract long store(User user);
}
