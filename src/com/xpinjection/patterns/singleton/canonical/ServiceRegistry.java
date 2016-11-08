package com.xpinjection.patterns.singleton.canonical;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alimenkou Mikalai
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
