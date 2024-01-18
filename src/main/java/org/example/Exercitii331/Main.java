package org.example.Exercitii331;

public class Main {
    public static void main(String[] args) {
        PigLatinTranslator translator = new PigLatinTranslator();

        String englishPhrase = "Hello world";
        String pigLatinTranslation = translator.translate(englishPhrase);

        System.out.println("Original: " + englishPhrase);
        System.out.println("Pig Latin: " + pigLatinTranslation);
    }
}

