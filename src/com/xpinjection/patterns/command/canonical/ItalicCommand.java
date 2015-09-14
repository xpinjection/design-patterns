// ============================================================================
//  File          : ItalicCommand
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
public class ItalicCommand implements Command {
    private final Editor editor;

    public ItalicCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.italic();
    }
}

