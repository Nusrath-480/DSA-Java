// Link: https://leetcode.com/problems/next-permutation/
// Language: Java
// Problem: 31. Next Permutation
// Topic: Arrays / Two Pointers
// Date: 6 Nov 2025

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If such an element is found
        if (i >= 0) {
            int j = n - 1;
            // Find the element just larger than nums[i]
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Step 3: Swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 4: Reverse the subarray after index i
        int start = i + 1;
        int end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
