package com.xpinjection.patterns.command.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class BoldCommand implements Command {
    private final Editor editor;

    public BoldCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.bold();
    }
}
