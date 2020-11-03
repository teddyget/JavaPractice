package com.example.helloworld;

import java.util.ArrayList;
import java.util.HashMap;

public class EssentialQuestions {

    // Most frequent occurring item in an array
    public static Integer mostFrequent(int[] givenArray) {
        Integer maxCount = -1;
        Integer maxItem = null;
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i : givenArray) {
            if (count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
            } else {
                count.put(i, 1);
            }
            if (count.get(i) > maxCount) {
                maxCount = count.get(i);
                maxItem = i;
            }
        }
        return maxItem;
    }

    // Find Common elements in two sorted arrays
    public static Integer[] commonElements(int[] array1, int[] array2) {
        int p1 = 0;
        int p2 = 0;
        // Need to use ArrayList because we don't know the size of the resulting
        // array yet. Note that an ArrayList is resizable.
        ArrayList<Integer> result = new ArrayList();
        while(p1 < array1.length && p2 < array2.length){
            if (array1[p1] == array2[p2]) {
                result.add(array1[p1]);
                p1 += 1;
                p2 += 1;
            }
            else if (array1[p1] > array2[p2]) {
                p2 += 1;
            } else {
                p1 += 1;
            }
        }
        // Convert the result to a regular array.
        Integer[] resultInArray = new Integer[result.size()];
        return result.toArray(resultInArray);
    }

    // Is One array a rotation of another array
    public static Boolean isRotation(int[] array1, int[] array2) {
        if (array1.length != array2.length) return false;
        int key = array1[0];
        int keyLoc = -1;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == key) {
                keyLoc = i;
                break;
            }
        }
        if (keyLoc == -1) return false;
        for (int i = 0; i < array1.length; i++) {
            int j = (keyLoc + i) % array1.length;
            if (array1[i] != array2[j]) return false;
        }
        return true;
    }
}
