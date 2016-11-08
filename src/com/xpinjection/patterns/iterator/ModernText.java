package com.xpinjection.patterns.iterator;

import java.util.stream.Stream;

/**
 * @author Alimenkou Mikalai
 */
public interface ModernText {
    Stream<String> linesStream();
}
