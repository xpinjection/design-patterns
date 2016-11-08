package com.xpinjection.patterns.templatemethod.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class TemplateMethodClient {
    public static void main(String[] args) {
        User mikalai = new LoggingUserRestorer().restore("Mikalai:32");
        System.out.println("Mikalai is restored: " + mikalai);
    }
}
