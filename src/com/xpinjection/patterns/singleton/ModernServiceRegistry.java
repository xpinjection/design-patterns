package com.xpinjection.patterns.singleton;

import com.xpinjection.patterns.singleton.canonical.NamedService;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author Alimenkou Mikalai
 */
public class ModernServiceRegistry {
    private final ConcurrentMap<String, NamedService> services = new ConcurrentHashMap<>();

    public void register(NamedService service) {
        String name = service.getName();
        System.out.println("Register service with name: " + name);
        services.put(name, service);
    }

    public NamedService getService(String name) {
        return services.get(name);
    }
}
