// ============================================================================
//  File          : CommandClient
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
public class CommandClient {
    public static void main(String[] args) {
        Document editor = new Document();

        Macro macro = new Macro();
        macro.record(new BoldCommand(editor));
        macro.record(new ItalicCommand(editor));
        macro.record(new UnderlineCommand(editor));
        macro.run();
    }
}
