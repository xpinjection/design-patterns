// ============================================================================
//  File          : Order
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.proxy.canonical;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class Order {
    private final long userId;
    private final Map<String, Integer> items = new HashMap<>();

    public Order(long userId) {
        this.userId = userId;
    }

    public void putItem(String code, int count) {
        items.put(code, count);
    }

    public long getUserId() {
        return userId;
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order{userId=" + userId + ", items=" + items + "}";
    }
}
