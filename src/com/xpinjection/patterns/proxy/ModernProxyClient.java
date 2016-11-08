package com.xpinjection.patterns.proxy;

import com.xpinjection.patterns.proxy.canonical.Order;
import com.xpinjection.patterns.proxy.canonical.RealOrderService;

import java.util.function.Consumer;

/**
 * @author Alimenkou Mikalai
 */
public class ModernProxyClient {
    public static void main(String[] args) {
        Order order = new Order(5L);
        order.putItem("XP", 2);

        RealOrderService service = new RealOrderService();
        PermissionChecker checker = new PermissionChecker();
        Consumer<Order> processing = ((Consumer<Order>) checker::checkPermission)
                .andThen(service::processOrder);

        checker.setCurrentUser(5);
        processing.accept(order);
        checker.setCurrentUser(2);
        processing.accept(order);
    }
}
