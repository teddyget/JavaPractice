package com.example.helloworld;

import java.util.*;

public class ArrayQuestions {

    // Reverse a string
    public String reverseString (String str){
        if(str == null || str == "" || str.length() < 2){
            return "ERROR";
        }
        String reversedString = "";
        for (int i = str.length() - 1; i >=0; i--){
            reversedString += str.charAt(i);
        }
        return reversedString;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //Merge two sorted arrays
    public ArrayList<Integer> mergeSortedArray(Integer[] array1, Integer[] array2){
        ArrayList<Integer> mergedArray = new ArrayList<>();
        Integer array1Item = array1[0];
        Integer array2Item = array2[0];
        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length){
            if(array1Item < array2Item){
                mergedArray.add(array1Item);
                array1Item = array1[i];
                i++;
            }
            else {
                mergedArray.add(array2Item);
                array2Item = array2[j];
                j++;
            }
        }
        return mergedArray;
    }

    //Using build in SORT method
    static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] mergedArr= new int[arr1.length + arr2.length];
        for(int i=0; i<arr1.length; i++){
            mergedArr[i]= arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            mergedArr[arr1.length+i]= arr2[i];
        }
        Arrays.sort(mergedArr);
        return mergedArr;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////


}
