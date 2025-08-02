// Java program to find special phrase in text

package com.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Main class
public class Main {
    public static void main(String[] args) {

        // Word "good" we are going to find
        Pattern pattern = Pattern.compile("good", Pattern.CASE_INSENSITIVE);

        // Text to work with
        Matcher matcher = pattern.matcher("The weather is good.");

        // Indicator if there is a word
        boolean matchFound = matcher.find();

        // Printing to console found or not pattern "good"
        if ((matchFound)){
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

    }
}