package com.xpinjection.patterns.command;

import com.xpinjection.patterns.command.canonical.Document;

/**
 * @author Alimenkou Mikalai
 */
public class ModernCommandClient {
    public static void main(String[] args) {
        Document editor = new Document();
        ModernMacro macro = new ModernMacro();

        macro.record(editor::bold)
                .record(editor::italic)
                .record(editor::underline)
                .run();
    }
}
