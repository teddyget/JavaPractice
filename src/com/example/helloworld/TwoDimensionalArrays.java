package com.example.helloworld;

public class TwoDimensionalArrays {
    /**
     * This method is used to assigns correct numbers in a field of Minesweeper,
     * which is represented as a 2 dimensional array
     * @param bombs First parameter which is a list of bomb locations.  Given as an array of arrays, for example
     *              [[0,0],[0,1]] which is ([row index = 0, column index = 0], [row index = 0, column index = 1])
     *              And assumes that there are no duplicates
     * @param numRows This is the number of rows in the resulting field
     * @param numCols This is the number of columns in the resulting field
     * @return field Returns the assigned numbers in format of array of arrays
    */
    public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
        int[][] field = new int[numRows][numCols];
        for (int[] bomb: bombs) {
            int rowIndex = bomb[0];
            int colIndex = bomb[1];
            field[rowIndex][colIndex] = -1;
            for(int i = rowIndex - 1; i < rowIndex + 2; i++) {
                for (int j = colIndex - 1; j < colIndex + 2; j++) {
                    if (0 <= i && i < numRows &&
                            0 <= j && j < numCols &&
                            field[i][j] != -1) {
                        field[i][j] += 1;
                    }
                }
            }
        }
        return field;
    }
}
