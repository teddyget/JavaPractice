package com.example.helloworld;

import java.util.*;

public class ArrayQuestions {

    // Reverse an array
    public int[] reverseArray (int[] input){
        for(int i = 0; i < input.length / 2; i++){
            int currentItem = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = currentItem;
        }
        return input;
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

    /**
     * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
     * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and
     * it will automatically contact the police if two adjacent houses were broken into on the same night.
     *
     * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money
     * you can rob tonight without alerting the police.
     * Input: [2,7,9,3,1]
     * Output: 12
     * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
     *              Total amount you can rob = 2 + 9 + 1 = 12.
     */

    public int rob(int[] houseAmount) {
        int previousMax = 0, currentMax = 0;

        for (int x : houseAmount) {
            int temp = currentMax;
            currentMax = Math.max(previousMax + x, currentMax);
            previousMax = temp;
        }
        return currentMax;
    }


    /**
     * Given an array of integers, return indexes of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */
    public int[] twoSums(int[] numbers, int sumTarget){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            int posibleSumNumber = sumTarget - numbers[i];
            if(map.containsKey(posibleSumNumber)){
                return new int[] { map.get(posibleSumNumber), i};
                //return actual numbers to be added that equals the target
                //return new Integer[] { posibleSumNumber, numbers[i]};
            }
            map.put(numbers[i], i);
        }
        return new int[]{0,0};
    }

    /**
     * Remove duplicate elements from an array
     * FIRST - with collections API using LinkedHashSet
     * SECOND - without collections API And Sorted
     * Third - without Collections API and not sorted
     *
     */
    public Integer[] removeDuplicates(Integer[] duplicates){
//        //Collection API Solution
//        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(duplicates));
//        return set.toArray(new Integer[] {});

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < duplicates.length; i++){
            if(map.containsKey(duplicates[i])){
                map.put(duplicates[i], map.get(duplicates[i] + 1));
            }
            map.put(duplicates[i], 1);
        }
        Integer[] array = map.keySet().toArray(new Integer[0]);
        int[] intArray = new int[map.size()];
        int index = 0;
        for(Integer element : array) intArray[index++] = element;
        return map.keySet().toArray(new Integer[0]);
//        *******************************************************************

//        //Sorted without collections API
//        Arrays.sort(duplicates);
//        int j = 0;
//        Integer[] temp = new Integer[duplicates.length];
//        for(int i = 0; i < duplicates.length - 1; i++){
//            Integer currentElement = duplicates[i];
//            if(!currentElement.equals(duplicates[i + 1])){
//                temp[j++] = currentElement;
//            }
//        }
//        temp[j++] = duplicates[duplicates.length - 1];
//        return temp;
//        =======================================================================
        //another sorted array
//        for (int i = 0; i < duplicates.length - 1; i++){
//            if (duplicates[i].equals(duplicates[i + 1])){
//                duplicates[i] = null;
//            }
//        }
//        return duplicates;
//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //return the length of the nonduplicated array with sorted orignal array
//        Arrays.sort(duplicates);
//        if (duplicates.length == 0) return new Integer[]{0};
//        int i = 0;
//        for (int j = 1; j < duplicates.length; j++) {
//            if (duplicates[j] != duplicates[i]) {
//                i++;
//                duplicates[i] = duplicates[j];
//            }
//        }
//        return new Integer[]{i + 1};
    }

    /**
     * Find largest and smallest numbers in an array
     *
     */
    public int[] smallestLargest(int[] numbers){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int number : numbers){
            if (number > largest){
                largest = number;
            }else if (number < smallest){
                smallest = number;
            }
        }
        return new int[]{smallest, largest};
    }

    /**
     * Find missing number / numbers in an array
     */
    public ArrayList<Integer> missingNumber(int[] numbers){
        //using n(n+1)/2 for non duplicate array
        ArrayList<Integer> missingNum = new ArrayList<>();
        int expectedSum = numbers.length * ((numbers.length + 1) / 2);
        int actualSum = 0;
        for (int i : numbers){
            actualSum += i;
        }
        missingNum.add(expectedSum - actualSum);
        return missingNum;

//        int[] register = new int[numbers.length];
//        ArrayList<Integer> missingList = new ArrayList<>();
//        for(int n : numbers){
//            register[n] = 1;
//        }
//        for(int i = 1; i < register.length; i++){
//            if(register[i] == 0){
//                missingList.add(i);
//            }
//        }
//        return missingList;
    }

}
