package com.example.helloworld;

public class Palindrome {
    public static boolean isPalindromeFirst (String str){
        //Pointers pointing to the beginning and the end of the string
        int i = 0 , j = str.length() - 1;

        //While there are characters to count, compare the first the last
        // and if the same increment and decrement pointers
        while (i < j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindromeSecond (String str){
        //Reverse the given string and use the .equals method to compare the
        //original and reversed strings
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static boolean isPalindromeThird (String str){
        //Reverse the given string using the .reverse() method
        String reverse  = new StringBuffer(str).reverse().toString();
        return str.equals(reverse);
    }

    public static boolean isPalindromeNumber (int numbers){
        int remainder, sum = 0, temp;
        temp = numbers;

        while (numbers > 0){
            remainder = numbers % 10;
            sum = (sum * 10) + remainder;
            numbers = numbers / 10;
        }
        return temp == sum;
    }

    public boolean isPalindromeNumberTwo(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }

    public boolean isPalindromeThree(int num){
        if(num < 0) return  false;
        int reversed = 0, remainder, original = num;
        while(num != 0) {
            remainder = num % 10; // reversed integer is stored in variable
            reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
            num  /= 10;  //the last digit is removed from num after division by 10.
        }
        // palindrome if original and reversed are equal
        return original == reversed;
    }
}
