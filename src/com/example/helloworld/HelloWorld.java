package com.example.helloworld;

import java.security.cert.TrustAnchor;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        String resultSeparator = "\n ################################### \n";

        //<editor-fold desc = "01 Given an array, find the hIndex (the highest repeated number">
        List<Integer> cit  = Arrays.asList(1,4,1,4,2,1,3,5,6);
        int n = hIndex(cit);
        System.out.println("01 The hIndex is --> " + n + resultSeparator);
        //</editor-fold>

        //<editor-fold desc = "02 Given an array of integer, find the second largest integer">
        Integer[] arrayOfInteger = {1,2,2,3,4,4};
        Integer secondLargest = second_largest(arrayOfInteger);
        System.out.println("02 Second largest number in the array is --> " + secondLargest + resultSeparator);
        //</editor-fold>

        //<editor-fold desc = "03 Given two strings, determine if two are reverse of each other">
        String firstString = "fuf";
        String secondString = "fuf";
        System.out.println("03 secondString is a reverse of firstString --> " + isReversedString(firstString,secondString) + resultSeparator);
        //</editor-fold>

        //<editor-fold> desc = "04 Given two strings, determine if two are reverse of each other">
        String firstNumber = "134";
        String secondNumber = "0134";
        System.out.println("04 firstNumber is greater than secondNumber --> " + isGreaterThan(firstNumber,secondNumber) + resultSeparator);
        //</editor-fold>

        //<editor-fold> desc = "05 Print all pairs in an array"
        String[] pairArray = {"A", "B", "C", "D", "E", "F"};
        logAllPairArray(pairArray);
        //</editor-fold>

        //<editor-fold> desc = "06 Determine if two arrays contain common item"
        String[] commonArrayOne = {"a","b","b","x","d"};
        String[] commonArrayTwo = {"e","f","g","h","b"};
        System.out.println(containsCommonItem(commonArrayOne, commonArrayTwo) + resultSeparator);
        //</editor-fold>

        //<editor-fold> desc = "07 Google Questions Sum of pair equals to a given number"
        int[] intArray = {1,2,4,4};
        int sum = 8;
        GoogleQuestions gq = new GoogleQuestions();
//        System.out.println(gq.hasPairWithSum(intArray, sum) + resultSeparator);
//        System.out.println(gq.hasPairWithSum1(intArray,sum) + resultSeparator);
        System.out.println(gq.hasPairWithSum2(intArray,sum) + resultSeparator);
        //</editor-fold>

        //<editor-fold> desc = "Array Questions"

        //merge two sorted arrays
        ArrayQuestions aq = new ArrayQuestions();
        Integer[] array1 = {0,1,3,4};
        Integer[] array2 = {4,7,8};
        System.out.println(aq.mergeSortedArray(array1,array2)  + resultSeparator);

        //</editor-fold>

        //<editor-fold> desc = "11 Essential Coding Interview questions"

        //<editor-fold> desc = "#1 - Most frequent occurring item in array"

        // mostFrequent(array1) should return 1.
        int[] mfArray1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] mfArray2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] mfArray3 = {};
        // mostFrequent(array4) should return 0.
        int[] mfArray4 = {0};
        // mostFrequent(array5) should return -1.
        int[] mfArray5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};

        System.out.println(EssentialQuestions.mostFrequent(mfArray1));
        System.out.println(EssentialQuestions.mostFrequent(mfArray2));
        System.out.println(EssentialQuestions.mostFrequent(mfArray3));
        System.out.println(EssentialQuestions.mostFrequent(mfArray4));
        System.out.println(EssentialQuestions.mostFrequent(mfArray5) + resultSeparator);
        //</editor-fold>

        //<editor-fold> desc = "#2 - Common elements in two sorted Arrays"

        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        // commonElements(array1A, array2A) should return [1, 4, 9] (an array).

        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        // common_elements(array1C, array2C) should return [] (an empty array).

        System.out.println(Arrays.toString(EssentialQuestions.commonElements(array1A,array2A)));
        System.out.println(Arrays.toString(EssentialQuestions.commonElements(array1B,array2B)));
        System.out.println(Arrays.toString(EssentialQuestions.commonElements(array1C,array2C)) + resultSeparator);

        //</editor-fold>

        //<editor-fold> desc = "#3 - Is one array a rotation of another array (rotation can start in a different index)"
        int[] originalArray1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
        // isRotation(array1, array2a) should return false.
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        // isRotation(array1, array2b) should return true.
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        // isRotation(array1, array2c) should return false.
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        // isRotation(array1, array2d) should return false.
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        // isRotation(array1, array2e) should return false.
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        // isRotation(array1, array2f) should return true.

        System.out.println(EssentialQuestions.isRotation(originalArray1,array2a));
        System.out.println(EssentialQuestions.isRotation(originalArray1,array2b));
        System.out.println(EssentialQuestions.isRotation(originalArray1,array2c));
        System.out.println(EssentialQuestions.isRotation(originalArray1,array2d));
        System.out.println(EssentialQuestions.isRotation(originalArray1,array2e));
        System.out.println(EssentialQuestions.isRotation(originalArray1,array2f) + resultSeparator);
        //<</editor-fold>

        //<editor-fold> desc = "#4 - Find the first non repeating character in a string"
        System.out.println(StringQuestions.nonRepeating("abcab")); // should return 'c'
        System.out.println(StringQuestions.nonRepeating("abab")); // should return null
        System.out.println(StringQuestions.nonRepeating("aabbbc")); // should return 'c'
        System.out.println(StringQuestions.nonRepeating("aabbdbc") + resultSeparator); // should return 'd'
        //</editor-fold>

        //<editor-fold> desc = "#5 - Given two strings, one of the strings is one edit away for becoming similar string with the other"

        //Three operations allowed (Change, delete or add)
        System.out.println(StringQuestions.isOneAway("abcde", "abcd"));  // should return true
        System.out.println(StringQuestions.isOneAway("abde", "abcde"));  // should return true
        System.out.println(StringQuestions.isOneAway("a", "a"));  // should return true
        System.out.println(StringQuestions.isOneAway("abcdef", "abqdef"));  // should return true
        System.out.println(StringQuestions.isOneAway("abcdef", "abccef"));  // should return true
        System.out.println(StringQuestions.isOneAway("abcdef", "abcde"));  // should return true
        System.out.println(StringQuestions.isOneAway("aaa", "abc"));  // should return false
        System.out.println(StringQuestions.isOneAway("abcde", "abc"));  // should return false
        System.out.println(StringQuestions.isOneAway("abc", "abcde"));  // should return false
        System.out.println(StringQuestions.isOneAway("abc", "bcc") + resultSeparator);  // should return false

        //</editor-fold>

        //<editor-fold> desc = "#6 - Assign numbers in a Minesweeper (Two Dimensional array)"
        int[][] bombs1 = {{0, 2}, {2, 0}};
        System.out.println(Arrays.deepToString(TwoDimensionalArrays.mineSweeper(bombs1, 3, 3)));
        //should return:
        // [[0, 1, -1],
        //  [1, 2, 1],
        //  [-1, 1, 0]]

        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        System.out.println(Arrays.deepToString(TwoDimensionalArrays.mineSweeper(bombs2, 3, 4)));
        //should return:
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]

        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        System.out.println(Arrays.deepToString(TwoDimensionalArrays.mineSweeper(bombs3, 5, 5)) + resultSeparator);
        //should return:
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]

        //</editor-fold

        //<editor-fold> desc = "#8 - Rotate a 2D array 90 degrees"

        int a1[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(Arrays.deepToString(TwoDimensionalArrays.rotate(a1, 3)));
        //should return:
        // [[7, 4, 1],
        //  [8, 5, 2],
        //  [9, 6, 3]]

        int a2[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(Arrays.deepToString(TwoDimensionalArrays.rotate(a2, 4)) + resultSeparator);
        //should return:
        // [[13, 9, 5, 1],
        //  [14, 10, 6, 2],
        //  [15, 11, 7, 3],
        //  [16, 12, 8, 4]]

        //</editor-fold>

        //</editor-fold>

    }

    // 01 hIndex
    public static int hIndex(List<Integer> citations){
        Collections.sort(citations);
        final int n = citations.size();
        for (int i = 0; i < n; ++i){
            if (citations.get(i) >= n - i) {
                return n - i;
            }
        }
        return 0;
    }

    // 02 Second largest from list array
    public static Integer second_largest (Integer[] arrayOfIntegers){
        Integer largest = null;
        Integer secondLargest = null;

        for (int currentNumber : arrayOfIntegers) {
            if (largest == null){
                largest = currentNumber;
            }
            else if (currentNumber > largest){
                secondLargest = largest;
                largest = currentNumber;
            }
            else if (secondLargest == null){
                secondLargest = currentNumber;
            }
            else if (currentNumber > secondLargest){
                secondLargest = currentNumber;
            }
        }
//        Use only to return null when there are largest number duplicate
//        if (largest == secondLargest){
//            return null;
//        }
        return secondLargest;
    }

    // 03 Check if two string are reverse of each other
    public static boolean isReversedString (String firstString, String secondString){
        for(int i = 0; i < firstString.length(); i++){
            int j = secondString.length() - i - 1;
            if (firstString.charAt(i) != secondString.charAt(j)){
                return false;
            }
        }
        return true;
    }

    // 04 Check if two strings with numbers are greater than each other
    public static boolean isGreaterThan (String firstNumber, String secondNumber){
        if (firstNumber.length() > secondNumber.length()){
            return true;
        }
        else if ( firstNumber.length() < secondNumber.length()) {
            return false;
        }
        for (int i = 0; i < firstNumber.length(); i++){
            if (firstNumber.charAt(i) == secondNumber.charAt(i)){
            }
            else return firstNumber.charAt(i) > secondNumber.charAt(i);
        }
        return false;
    }

    // 05 Print all pairs in an array
    public static void logAllPairArray(String[] array){
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.println(array[i] + array[j]);
            }
        }
    }

    // 06 check if there are common items in two arrays
    public static boolean containsCommonItem(String[] first, String[] second){
        Set<String> set = new HashSet<>();
        for (String item : first){
            set.add(item);
        }
        for (String item : second){
            if(set.contains(item)){
                return true;
            }
        }
        return false;
    }
}
