// Link: https://leetcode.com/problems/search-a-2d-matrix/
// Language: Java
// Problem: 74. Search a 2D Matrix
// Topic: Arrays / Binary Search
// Date: 5 Nov 2025

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // convert mid into row and column index
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
