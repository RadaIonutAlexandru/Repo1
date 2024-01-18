package org.example.Exercitii331;

public class PigLatinTranslator {
    public String translate(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(translateWord(word)).append(" ");
        }

        return result.toString().trim();
    }

    private String translateWord(String word) {
        if (startsWithVowelSound(word)) {
            return word + "ay";
        } else {
            int vowelIndex = findFirstVowelIndex(word);
            String prefix = word.substring(0, vowelIndex);
            String suffix = word.substring(vowelIndex);

            if (prefix.endsWith("q") && suffix.startsWith("u")) {

                return suffix.substring(1) + prefix + "uay";
            } else {

                return suffix + prefix + "ay";
            }
        }
    }

    private boolean startsWithVowelSound(String word) {
        return word.matches("(?i)^[aeiouyxr].*");
    }

    private int findFirstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            if ("aeiouy".indexOf(Character.toLowerCase(word.charAt(i))) != -1) {
                return i;
            }
        }
        return word.length();
    }
}

