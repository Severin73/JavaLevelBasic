package com.javalevelbasic.task026;

/**
 * Write a method that will return the number of words in a line of text.
 */
public class CountWordsInSentence {

    public static void main(String[] args) {
        String sentence = "Java is a programming language";
        System.out.println(countWords(sentence));
    }

    public static int countWords(String sentence) {
        return sentence.split("\\s+").length;
    }
}
