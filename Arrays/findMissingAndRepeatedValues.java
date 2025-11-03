// Problem: 2965. Find Missing and Repeated Values
// Link: https://leetcode.com/problems/find-missing-and-repeated-values/
// Language: Java
// Date: 3 Nov 2025
// Topic: Arrays

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] freq = new int[n * n + 1];
        int repeat = -1, missing = -1;

        // Count frequency of each number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        // Identify repeated and missing numbers
        for (int i = 1; i <= n * n; i++) {
            if (freq[i] == 2) repeat = i;
            if (freq[i] == 0) missing = i;
        }

        return new int[]{repeat, missing};
    }
}
