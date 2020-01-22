package com.example.helloworld;

import java.util.*;

public class GoogleQuestions {

    //Determine a given array contains pair of numbers, if added, that would equal to a given number
    //For example
    // arrayOne = [2,3,4,5] and SumNumber = 8  Then this is true
    // arrayTwo = [2,4,2,9] and SumNumber = 9  Then this is false

    //Brute force method
    public boolean hasPairWithSum(int[] array, int sum){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] + array[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }

    //Better method if array is always sorted
    public boolean hasPairWithSum1(int[] array, int sum){
        int low = 0;
        int high = array.length - 1;

        while (low < high){
            if(array[low] + array[high] == sum){
                return true;
            }
            else {low++;}
        }
        return false;
    }

    //Better solution with set
    public boolean hasPairWithSum2(int[] array, int sum){
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < array.length; i++){
            if(set.contains(array[i])){
                return true;
            }
            set.add(sum - array[i]);
        }
        return false;
    }

}
