// ============================================================================
//  File          : RealOrderService
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.proxy.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class RealOrderService implements OrderService {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order processed: " + order);
    }
}
