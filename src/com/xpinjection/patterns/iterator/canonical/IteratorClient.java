package com.xpinjection.patterns.iterator.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class IteratorClient {
    public static void main(String[] args) {
        Text text = new MultilineText("This is just \n" +
                " a simple multiline \n" +
                "\n" +
                " text\n" +
                "\n", "\n");
        LineIterator lineIterator = text.lineIterator();
        String line = lineIterator.nextLine();
        while (line != null) {
            System.out.println(line);
            line = lineIterator.nextLine();
        }

        String sentence = "JEEConf is the oldest Java conference in Ukraine";
        System.out.println(capitalize(sentence));
    }

    private static String capitalize(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder caps = new StringBuilder();

        for (String word : words) {
            if (word.length() > 4) {
                caps.append(word.toUpperCase()).append(' ');
            }
        }

        return caps.toString().trim();
    }
}
