// Problem: 88. Merge Sorted Array
// Link: https://leetcode.com/problems/merge-sorted-array/
// Language: Java
// Date: 4 Nov 2025
// Topic: Arrays

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Step 1: Copy nums2 elements into nums1 (after m elements)
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // Step 2: Sort the combined array
        Arrays.sort(nums1);
    }
}
