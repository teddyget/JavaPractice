package com.example.helloworld;

import java.util.ArrayList;

public class AZpractice {
    /**
     Given a string, count the number of palindrome substrings
     Example:
        Input: str = "abaab"
        Output: 3
        palindrome substrings:  "aba", "baab", "aa"
     */
    public static int countPS(String str){
        String temp = "";
        StringBuffer stf;
        int count = 0;
        // Iterate the loop twice
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // Get each substring
                temp = str.substring(i, j);

                // If length is greater than or equal to two
                // Check for palindrome
                if (temp.length() >= 2) {
                    // Use StringBuffer class to reverse the string
                    stf = new StringBuffer(temp);
                    stf.reverse();
                    // Compare substring wih reverse of substring
                    if (stf.toString().compareTo(temp) == 0)
                        count++;
                }
            }
        }
        // return the count
        return count;
    }

    /** Same as above but this function takes a single character as a palindrome as well */
    public static int countSubstrings(String S) {
        int N = S.length(), ans = 0;
        for (int center = 0; center <= 2*N-1; ++center) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }

    /** same as above but in a simpler to read approach */
    public static int countSubstringsTwo(String str) {
        if(str == null || str.length() < 1) return 0;
        int count = 0;
        for(int i=0;i<str.length();i++){
            count += countPalindromes(str, i, i); //Count even sized
            count += countPalindromes(str, i, i+1); //Count odd sized
        }
        return count;
    }

    private static int countPalindromes(String str, int s, int e){
        int count = 0;
        while(s>=0 && e<str.length() && str.charAt(s) == str.charAt(e)){
            s--;
            e++;
            count++;
        }
        return count;
    }

    /**
     * Given two integers (a number and divider) find the remainder without modulo % operator
     * EXAMPLE
            Input:  num1=10, num2=3
            Output: remainder=1
     */
    public static int getRemainder(int num1, int num2){
        return (num1 - num2 * (num1 / num2));
    }
    public static int getRemainderTwo(int num1, int num2){
        while(num1>=num2){
            num1 -= num2;
        }
        return num1;
    }
    public static int getRemainderThree(int num1, int num2){
        int i;
        for(i = 0; ;i++){
            if(num2 * i >= num1)
                break;
        }
        return num1 - (num2 * (i - 1));
    }

    /**
     * Given two sorted arrays, merge second array into the first array
     * assuming that first array has enough space to hold the second array's elements
     * Example
            Input: Array1:[1,2,3,0,0,0]  Array2:[2,5,6]
            Output: [1,2,2,3,5,6]
     */
    public static int[] merge(int[] array1, int n, int[] array2, int m) {
        //pointers for array1 and array2
        int i = n - 1;
        int j = m - 1;
        // set pointer for the new array1
        int k = n + m - 1;

        // while there are still elements to compare
        while ((i >= 0) && (j >= 0))
            // compare two elements from array1 and array2
            // and add the largest one in array1
            array1[k--] = (array1[i] < array2[j]) ? array2[j--] : array1[i--];

        // add missing elements from array2
        System.arraycopy(array2, 0, array1, 0, j + 1);
        return array1;
    }

    /** Same question as above but merge the two arrays into a new separate array */
    public static int[] mergeSortedArray(int[] array1, int[] array2) {

        int[] answer = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length)
            answer[k++] = array1[i] < array2[j] ? array1[i++] :  array2[j++];

        while (i < array1.length)
            answer[k++] = array1[i++];

        while (j < array2.length)
            answer[k++] = array2[j++];

        return answer;
    }

    /**
     * Given an array of integers, push all zeros to the end of the array
     * while maintaining the order of the non-zero elements
     * Example
     *      Input: [1,0,2,0,3,0]
     *      Output: [1,2,3,0,0,0]
     */
    public static void moveZeroes(int[] nums) {
        int leftMostZeroIndex = 0; // The index of the leftmost zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i > leftMostZeroIndex) { // There are zero(s) on the left side of the current non-zero number, swap!
                    nums[leftMostZeroIndex] = nums[i];
                    nums[i] = 0;
                }
                leftMostZeroIndex++;
            }
        }
    }

    /**
     * Find the maximum consecutive repeating character in a string
     * Example
     *      Input: str = "aabbbccd"
     *      Output: char = b
     */
    public static char maxRepeatingChar(String str)
    {
        int count = 0;
        char res = str.charAt(0);
        int cur_count = 1;

        // Traverse string except last character
        for (int i = 0; i < str.length(); i++) {
            // If current character matches with next
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1))
                cur_count++;
                // If doesn't match, update result
                // (if required) and reset count
            else {
                if (cur_count > count) {
                    count = cur_count;
                    res = str.charAt(i);
                }
                cur_count = 1;
            }
        }
        return res;
    }


}
