package com.xpinjection.patterns.iterator.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class MultilineText implements Text {
    private final String text;
    private final String lineSeparator;

    public MultilineText(String text, String lineSeparator) {
        this.text = text;
        this.lineSeparator = lineSeparator;
    }

    @Override
    public LineIterator lineIterator() {
        return new SeparatorBasedLineIterator();
    }

    private class SeparatorBasedLineIterator implements LineIterator {
        private int lineStartIndex = 0;

        @Override
        public String nextLine() {
            if (lineStartIndex >= text.length()) {
                return null;
            }
            int separatorIndex = text.indexOf(lineSeparator, lineStartIndex + 1);
            if (separatorIndex < 0) {
                separatorIndex = text.length() - 1;
            }
            String line = text.substring(lineStartIndex, separatorIndex);
            lineStartIndex = separatorIndex + 1;
            return line;
        }
    }
}
