// Link: https://leetcode.com/problems/search-a-2d-matrix/
// Language: Java
// Problem: 74. Search a 2D Matrix
// Topic: Arrays

// Date: 5 Nov 2025

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;  // start from top-right corner

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // found target
            } else if (matrix[row][col] > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        }

        return false; // not found
    }
}
