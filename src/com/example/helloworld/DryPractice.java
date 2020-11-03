package com.example.helloworld;

import java.util.HashSet;
import java.util.Set;

public class DryPractice {
    //Given an array of integers, see if two numbers add up to a targeted number

    //If the array is always sorted
    boolean hasPairWithSum (int[] numbers, int target){
        int low = 0;
        int high = numbers.length - 1;

        while(low < high){
            if(numbers[low] + numbers[high] == target){
                //return the numbers
                int[] pairNumbers = {numbers[low], numbers[high]};
                return true;
            }
            low++;
        }
        return false;
    }

    //If not sorted and a better solution for all
    boolean hasPairWithSumBetter (int[] numbers, int target){
        Set<Integer> set  = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            if(set.contains(numbers[i])){
                //return the numbers
                int[] pairNumbers = {numbers[i], numbers[i] - target};
                return true;
            }
            set.add(target - numbers[i]);
        }
        return false;
    }
}
