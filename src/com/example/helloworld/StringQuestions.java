package com.example.helloworld;

import java.util.*;

public class StringQuestions {
    /**  ************ RETURN THE FIRST NON REPEATING CHARACTER IN A STRING *******************
     */
    //Return the first non repeating character in a string using toCharArray
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

    //return the first non repeating character in a string using charAt()
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
        //Print all repeating characters along side with the count of repetetion
        Set<Map.Entry<Character, Integer>> entrySet = charCount.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet){
            if ( entry.getValue() > 1){
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }

        for (int i = 0; i < str.length(); i++){
            if (charCount.get(str.charAt(i)) == 1) return str.charAt(i);
        }
        return null;
    }

    // Another way of returning the non repeating character by only
    // iterating through the string once, but adds storage due to creating
    // a set and list to keep track of the repeating and non repeating chars
    public static char nonRepeatUsingSet (String str){
        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeat = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if(repeating.contains(str.charAt(i))){
                continue;
            }
            if(nonRepeat.contains(str.charAt(i))){
                nonRepeat.remove((Character) str.charAt(i));
                repeating.add(str.charAt(i));
            }else{
                nonRepeat.add(str.charAt(i));
            }
        }
        return nonRepeat.get(0);
    }

    /**  ************ COUNT OCCURRENCES OF A CHARACTER IN A STRING *******************
     */

    public static int countOccurance(String input, char target){
        int count = 0;
        for(char c : input.toCharArray()){
            if (c == target){
                count ++;
            }
        }
        return count;
    }

    /**  ************ REVERSE STRING IN THREE WAYS *******************
     */

    //Reverse string using StringBuffer's reverse() method
    public static String reverseUsingSBuffer (String str){
        return new StringBuffer(str).reverse().toString();
    }

    //Reverse string using iteration method
    public static String reverseUsingIteration (String str){
        //With StringBuilder

        StringBuilder strBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            strBuilder.append(str.charAt(i));
        }
        //Without String builder
//        String reverse = "";
//        for(int i = str.length() - 1; i >= 0; i--){
//            reverse += str.charAt(i);
//        }
        return strBuilder.toString();
    }

    //Reverse String using recursive method
    public static String reverseUsingRecursion(String str){
        if(str.length() < 2){
            return str;
        }
        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    /**      ****************REMOVE DUPLICATES FROM A STRING *******************
     */
    public static String removeDuplicates(String str){
        //using set
        Set<Character> chars = new HashSet<>();
        String output = "";
//        for(int i = 0; i < str.length(); i++){
//            if(chars.add(str.charAt(i))){
//                output += str.charAt(i);
//            }
//        }
//        return output;
        for(int i = 0; i < str.length(); i++){
            String character = str.substring(i, i+1);
            if(!output.contains(character)){
                output += character;
            }
        }
        return output;
    }

    /**              ***********  LONGEST COMMON PREFIX ******************
     * Write a function to find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     * Example 1:
     *
     * Input: ["flower","flow","flight"]
     * Output: "fl"
     */

    public static String longestCommonPrefix(String[] str){
        if(str.length == 0) return "";
        String prefix = str[0];
        for(int i = 1; i < str.length; i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
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
