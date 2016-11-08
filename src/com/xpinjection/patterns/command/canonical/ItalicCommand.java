package com.xpinjection.patterns.command.canonical;

/**
 * @author Alimenkou Mikalai
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

