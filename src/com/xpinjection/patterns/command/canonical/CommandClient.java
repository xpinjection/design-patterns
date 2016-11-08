package com.xpinjection.patterns.command.canonical;

/**
 * @author Alimenkou Mikalai
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
