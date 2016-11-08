package com.xpinjection.patterns.command.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class UnderlineCommand implements Command {
    private final Editor editor;

    public UnderlineCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.underline();
    }
}
