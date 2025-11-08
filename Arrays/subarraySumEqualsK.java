// Link: https://leetcode.com/problems/subarray-sum-equals-k/
// Problem: 560. Subarray Sum Equals K
// Language: Java
// Topic: Arrays, Prefix Sum (Brute Force Approach)
// Date: 8 Nov 2025

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
