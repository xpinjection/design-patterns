// ============================================================================
//  File          : PrototypeClient
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.prototype.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class PrototypeClient {
    public static void main(String[] args) {
        Editor editor = new Editor();

        Circle circle = editor.addCircle();
        circle.changeRadix(5);

        Rectangle rectangle = editor.addRectangle();
        rectangle.changeSize(1, -1);
    }
}
