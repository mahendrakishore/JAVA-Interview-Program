package Intellias;

import java.util.HashSet;

public class Missingletters {
    public static String findMissingLetters(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        HashSet<Character> inputSet = new HashSet<>();

        // Convert input to lowercase and store in HashSet
        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                inputSet.add(ch);
            }
        }

        // Find missing letters
        StringBuilder missingLetters = new StringBuilder();
        for (char ch : alphabet.toCharArray()) {
            if (!inputSet.contains(ch)) {
                missingLetters.append(ch);
            }
        }

        return missingLetters.toString();
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println("Missing letters: " + findMissingLetters(input));
    }
}

