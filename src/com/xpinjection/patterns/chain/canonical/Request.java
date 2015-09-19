// ============================================================================
//  File          : Request
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.chain.canonical;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class Request {
    private final long userId;
    private final Map<String, String> params = new HashMap<>();

    public Request(long userId) {
        this.userId = userId;
    }

    public Request addParam(String name, String value) {
        params.put(name, value);
        return this;
    }

    public long getUserId() {
        return userId;
    }

    public Map<String, String> getParams() {
        return params;
    }

    @Override
    public String toString() {
        return "Request{userId=" + userId + ", params=" + params + "}";
    }
}
