// ============================================================================
//  File          : Document
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.command.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
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
