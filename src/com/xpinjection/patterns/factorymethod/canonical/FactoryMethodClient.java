package com.xpinjection.patterns.factorymethod.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class FactoryMethodClient {
    public static void main(String[] args) {
        DocumentFactory factory = new JsonDocumentFactory();
        Document document = factory.create("USER");
        document.addField("name", "Mikalai");
        document.addField("surname", "Alimenkou");
        System.out.println(document);
    }
}
