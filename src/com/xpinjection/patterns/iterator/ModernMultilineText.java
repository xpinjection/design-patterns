package com.xpinjection.patterns.iterator;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * @author Alimenkou Mikalai
 */
public class ModernMultilineText implements ModernText {
    private final String text;
    private final String lineSeparator;

    public ModernMultilineText(String text, String lineSeparator) {
        this.text = text;
        this.lineSeparator = lineSeparator;
    }

    @Override
    public Stream<String> linesStream() {
        return StreamSupport.stream(new LineSupplier(), false);
    }

    private class LineSupplier extends Spliterators.AbstractSpliterator<String> {
        private int lineStartIndex = 0;

        public LineSupplier() {
            super(Long.MAX_VALUE, Spliterator.NONNULL | Spliterator.SIZED);
        }

        @Override
        public boolean tryAdvance(Consumer<? super String> action) {
            if (lineStartIndex >= text.length()) {
                return false;
            }
            int separatorIndex = text.indexOf(lineSeparator, lineStartIndex + 1);
            if (separatorIndex < 0) {
                separatorIndex = text.length() - 1;
            }
            String line = text.substring(lineStartIndex, separatorIndex);
            action.accept(line);
            lineStartIndex = separatorIndex + 1;
            return true;
        }
    }
}
