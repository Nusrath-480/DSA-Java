// Link: https://leetcode.com/problems/set-matrix-zeroes/
// Language: Java
// Problem: 73. Set Matrix Zeroes
// Topic: Arrays / Matrix Manipulation
// Date: 8 Nov 2025

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1: Create marker arrays to track which row and column need to be zeroed
        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];

        // Step 2: Identify rows and columns that contain a zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        // Step 3: Set matrix cells to zero based on markers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowZero[i] || colZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
