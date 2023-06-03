package com.example7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * 73:
 *
 *Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
 *
 * */
public class SetMatrixZero {


    public static void main(String[] args) {
        int[][] processedArray =setZeroes(new int[][]{{1,1,1,},{1,0,1},{1,1,1}});
       Arrays.stream(processedArray).forEach(ints -> Arrays.stream(ints).forEach(i -> System.out.println(i)));


    }
    public static int[][]  setZeroes(int[][] matrix){
        int R = matrix.length;
        int C= matrix[0].length;

        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }

            }

        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(rows.contains(i) || cols.contains(j)){
                    matrix[i][j] =0;
                }

            }

        }

        return matrix;
    }
}
