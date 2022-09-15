package com.wordfrequency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Given a piece of text, it should output each word in the text and the number of times it occurred.
 * The words should be sorted by frequency, in descending order.
 * Words with the same frequency can be in any order.
 *
 * For example for the input “the cat is in the bag”, output should be:
 * 2 the
 * 1 cat
 * 1 is
 * 1 in
 * 1 bag
 */
public final class App {

    /**
     * @param args The text to count and sort decending by frequency. Defaults to "The cat is in the bag bag bag." if unset.
     */
    public static void main(String[] args) {
        String exampleText = "The cat is in the bag bag bag.";
        HashMap<String, Integer> frequentWords = new HashMap<String, Integer>();

        if (args.length > 0) {
            exampleText = args[0];
        }
        System.out.println("Counting words and sorting decending by frequency on \"" + exampleText + "\"");

        for (String word: exampleText.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+")) {
            frequentWords.merge(word.toLowerCase(), 1, (oldValue, newValue) -> oldValue + newValue);
        }

        ArrayList<Entry<String, Integer>> wordsByFrequency = new ArrayList<Entry<String, Integer>>(frequentWords.entrySet());
        wordsByFrequency.sort(Collections.reverseOrder(Entry.comparingByValue()));

        for (Entry<String, Integer> entry: wordsByFrequency) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
