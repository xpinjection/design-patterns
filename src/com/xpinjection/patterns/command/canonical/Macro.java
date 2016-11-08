package com.xpinjection.patterns.command.canonical;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alimenkou Mikalai
 */
public class Macro {
    private final List<Command> commands = new ArrayList<>();

    public void record(Command action) {
        commands.add(action);
    }

    public void run() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
