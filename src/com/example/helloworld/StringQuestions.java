package com.example.helloworld;

import java.util.HashMap;

public class StringQuestions {
    //Return the first non repeating character in a string
    public static Character nonRepeating(String s) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        // NOTE: Using s.toCharArray() is not the most efficient method,
        // but I chose to use it here for simplicity.
        for (char c : s.toCharArray()) {
            if (charCount.containsKey(c)) {
                Integer newVal = charCount.get(c) + 1;
                charCount.put(c, newVal);
            } else {
                charCount.put(c, 1);
            }
        }
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) return c;
        }
        return null;
    }

    public static Character nonRepeatingChar(String str){
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if (charCount.containsKey(str.charAt(i))){
                charCount.put(str.charAt(i), charCount.get(str.charAt(i)) + 1);
            }
            else {
                charCount.put(str.charAt(i), 1);
            }
        }
        for (int i = 0; i < str.length(); i++){
            if (charCount.get(str.charAt(i)) == 1) return str.charAt(i);
        }
        return null;
    }

    public static Boolean isOneAway(String s1, String s2) {
        if (s1.length() - s2.length() >= 2 || s2.length() - s1.length() >= 2) {
            return false;
        } else if (s1.length() == s2.length()) {
            return isOneAwaySameLength(s1, s2);
        } else if (s1.length() > s2.length()) {
            return isOneAwayDiffLengths(s1, s2);
        } else {
            return isOneAwayDiffLengths(s2, s1);
        }
    }

    public static Boolean isOneAwaySameLength(String s1, String s2) {
        int countDiff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                countDiff += 1;
                if (countDiff > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    // Assumption: s1.length() == s2.length() + 1
    public static Boolean isOneAwayDiffLengths(String s1, String s2) {
        int i = 0;
        int countDiff = 0;
        while (i < s2.length()) {
            if (s1.charAt(i + countDiff) == s2.charAt(i)) {
                i += 1;
            } else {
                countDiff += 1;
            }
            if (countDiff > 1) {
                return false;
            }
        }
        return true;
    }
}
