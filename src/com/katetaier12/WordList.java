package com.katetaier12;

public class WordList {

    public static String printTheInitialList() {
        return "white black blue yellow green red pink purple";
    }

    public static String makeFirstLetterInUpperCase() {
        String initialList = "white black blue yellow green red pink purple";
        StringBuilder builder = new StringBuilder();
        for (String value : initialList.split(" ")) {
            builder.append(Character.toUpperCase(value.charAt(0)));
            builder.append(value.substring(1));
            builder.append(" ");
        }
        builder.deleteCharAt(initialList.length());
        return "" + builder;
    }

    public static String makeViceVersa() {
        String initialWithUpperCase = makeFirstLetterInUpperCase();
        String[] substring = initialWithUpperCase.split(" ");
        for (int i = 0; i < substring.length / 2; i++) {
            String temp = substring[substring.length - i - 1];
            substring[substring.length - i - 1] = substring[i];
            substring[i] = temp;
        }
        StringBuilder builder = new StringBuilder();
        for (String word : substring) {
            builder.append(word);
            builder.append(" ");
        }
        return "" + builder;
    }
}