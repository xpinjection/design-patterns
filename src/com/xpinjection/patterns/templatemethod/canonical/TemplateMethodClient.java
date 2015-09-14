// ============================================================================
//  File          : TemplateMethodClient
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.templatemethod.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class TemplateMethodClient {
    public static void main(String[] args) {
        User mikalai = new LoggingUserRestorer().restore("Mikalai:32");
        System.out.println("Mikalai is restored: " + mikalai);
    }
}
