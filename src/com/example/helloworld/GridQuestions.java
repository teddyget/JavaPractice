package com.example.helloworld;

import java.util.Arrays;

public class GridQuestions {
    public static int numberOfPaths(int row, int column){
        //Store all possible spaces in a 2D table
        int [][] count = new int[row][column];

//        //count of paths to reach any cell in first column is 1
//        for(int i = 0; i < row; i++){
//            count[i][0] = 1;
//        }
//        //count of paths to reach any cell in first row is
//        for(int j = 0; j < column; j++){
//            count[0][j] = 1;
//        }

        //OR you can do the above two in the following way
        for(int[] arr : count){
            Arrays.fill(arr, 1);
        }

        //Calculate count of paths for other cells in bottom-up manner
        for(int i = 1; i < row; i++){
            for(int j = 1; j < column; j++){
                count[i][j] = count[i - 1][j] + count[i][j - 1];
            }
        }
        return count[row - 1][column - 1];
    }

    public static int numberOfPathsTwo(int row, int column){
        int[] count = new int [column];
        count[0] = 1;

        for(int i = 0; i < row; i++){
            for(int j = 1; j < column; j++){
                count[j] += count[j - 1];
            }
        }
        return count[column - 1];
    }
}
