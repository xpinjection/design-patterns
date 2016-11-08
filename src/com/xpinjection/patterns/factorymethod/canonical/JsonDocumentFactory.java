package com.xpinjection.patterns.factorymethod.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class JsonDocumentFactory implements DocumentFactory {
    @Override
    public Document create(String name) {
        return new JsonDocument(name);
    }
}
