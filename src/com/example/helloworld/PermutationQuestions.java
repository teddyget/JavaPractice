package com.example.helloworld;

import java.util.HashSet;
import java.util.Set;

public class PermutationQuestions {
    static void swap(char[] ch, int i, int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    //Permutate by passing character array and do a swap
    public static void permutationOne (char[] ch, int currentIndex){
        if(currentIndex == ch.length - 1){
            System.out.println(String.valueOf(ch));
        }
        for(int i = currentIndex; i <= ch.length - 1; i++){
            swap(ch, currentIndex, i);
            permutationOne(ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
    }

    //Permutate without passing character array or use of a swap helper method
    public static void permutateThree(String candidate, String remaining){
        if(remaining.length() == 0){
            System.out.println(candidate);
        }
        for (int i = 0; i < remaining.length(); i++){
            String newCandidate = candidate + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            permutateThree(newCandidate, newRemaining);
        }
    }

    public static Set<String> generatePerm(String input)
    {
        Set<String> set = new HashSet<>();
        if (input == "")
            return set;

        Character chr = input.charAt(0);

        if (input.length() > 1) {
            input = input.substring(1);
            Set<String> permSet = generatePerm(input);
            for (String str : permSet) {
                for (int i = 0; i <= str.length(); i++) {
                    set.add(str.substring(0, i) + chr + str.substring(i));
                }
            }
        }
        else {
            set.add(chr + "");
        }
        return set;
    }

    ////NOT WORKING////

//    static String swapTwo(String a, int i, int j){
//        char[] chr = a.toCharArray();
//        char temp = chr[i];
//        chr[i] = chr[j];
//        chr[j] = temp;
//        return String.valueOf(chr);
//    }
//    public static void permutationTwo(String str, int currentIndex, int strLength){
//        if(currentIndex == strLength - 1){
//            System.out.println(str);
//        }else{
//            for(int i = currentIndex; i < strLength; i++){
//                swapTwo(str, currentIndex, i);
//                permutationTwo(str, currentIndex + 1, strLength);
//                swapTwo(str, currentIndex, i);
//            }
//        }
//    }
}
