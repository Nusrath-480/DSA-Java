// Link: https://leetcode.com/problems/maximum-subarray/
// Language: Java
// Problem: 53. Maximum Subarray
// Topic: Arrays 
// Date: 5 Nov 2025

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];  // sum of current subarray
        int maxSum = nums[0];      // best sum found so far

        for (int i = 1; i < nums.length; i++) {
            // either start a new subarray at nums[i] or extend the previous one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // update the best sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
