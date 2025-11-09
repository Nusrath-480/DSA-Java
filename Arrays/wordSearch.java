// 🔗 Link: https://leetcode.com/problems/search-a-2d-matrix-ii/
// 💡 Problem: 240. Search a 2D Matrix II
// 🧠 Topic: Matrix, Binary Search, Two Pointer
// 📅 Date: 9 Nov 2025


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;         // number of rows
        int cols = matrix[0].length;      // number of columns
        
        int i = 0;                        // start from top row
        int j = cols - 1;                 // start from last column (top-right)
        
        while (i < rows && j >= 0) {      // stay within matrix bounds
            if (matrix[i][j] == target) { // found target
                return true;
            } 
            else if (matrix[i][j] > target) { 
                j--;  // move left
            } 
            else {
                i++;  // move down
            }
        }
        
        return false; // target not found
    }
}
