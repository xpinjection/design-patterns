// ============================================================================
//  File          : ModernMAcro
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.command;

import com.xpinjection.patterns.command.canonical.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernMacro {
    private final List<Command> commands = new ArrayList<>();

    public ModernMacro record(Command action) {
        commands.add(action);
        return this;
    }

    public void run() {
        commands.stream().forEach(Command::execute);
    }
}
