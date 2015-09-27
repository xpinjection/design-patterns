// ============================================================================
//  File          : Registry
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.singleton.canonical;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public final class ServiceRegistry {
    private static final ServiceRegistry INSTANCE = new ServiceRegistry();

    public static ServiceRegistry getInstance() {
        return INSTANCE;
    }

    private final Map<String, NamedService> services = new HashMap<>();

    private ServiceRegistry() {}

    public void register(NamedService service) {
        String name = service.getName();
        System.out.println("Register service with name: " + name);
        services.put(name, service);
    }

    public NamedService getService(String name) {
        return services.get(name);
    }
}
