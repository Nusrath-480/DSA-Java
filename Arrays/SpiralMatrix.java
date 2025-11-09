// 🔗 Link: https://leetcode.com/problems/spiral-matrix/
// 💡 Problem: 54. Spiral Matrix
// 🧠 Topic: Matrix, Simulation
// 📅 Date: 9 Nov 2025


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix.length == 0) return result; // if matrix is empty

        int top = 0;                      // starting row
        int bottom = matrix.length - 1;   // ending row
        int left = 0;                     // starting column
        int right = matrix[0].length - 1; // ending column

        // run until all rows and columns are covered
        while (top <= bottom && left <= right) {

            // 1️⃣ Traverse from Left → Right (top row)
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // move top boundary down (row finished)

            // 2️⃣ Traverse from Top → Bottom (right column)
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // move right boundary left (column finished)

            // 3️⃣ Traverse from Right → Left (bottom row)
            if (top <= bottom) { // check if row still exists
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // move bottom boundary up
            }

            // 4️⃣ Traverse from Bottom → Top (left column)
            if (left <= right) { // check if column still exists
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // move left boundary right
            }
        }

        return result;
    }
}
