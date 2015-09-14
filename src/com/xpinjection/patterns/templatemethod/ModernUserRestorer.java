// ============================================================================
//  File          : ModernUserRestorer
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.templatemethod;

import com.xpinjection.patterns.templatemethod.canonical.User;

import java.util.StringTokenizer;
import java.util.function.ToLongFunction;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernUserRestorer {
    private static final String DELIMITER = ":";

    private final ToLongFunction<User> storage;

    public ModernUserRestorer(ToLongFunction<User> storage) {
        this.storage = storage;
    }

    public User restore(String serialized) {
        StringTokenizer tokenizer = new StringTokenizer(serialized, DELIMITER);
        validate(tokenizer);
        User user = parse(tokenizer);
        long id = storage.applyAsLong(user);
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
}
