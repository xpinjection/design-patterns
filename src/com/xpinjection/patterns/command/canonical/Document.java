package com.xpinjection.patterns.command.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class Document implements Editor {
    @Override
    public void bold() {
        System.out.println("Bold text...");
    }

    @Override
    public void italic() {
        System.out.println("Italic text...");
    }

    @Override
    public void underline() {
        System.out.println("Underline text...");
    }
}
