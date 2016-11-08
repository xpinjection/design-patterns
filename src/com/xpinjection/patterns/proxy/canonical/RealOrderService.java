package com.xpinjection.patterns.proxy.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class RealOrderService implements OrderService {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order processed: " + order);
    }
}
