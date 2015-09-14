// ============================================================================
//  File          : Macro
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.command.canonical;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
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
