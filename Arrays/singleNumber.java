// Problem: 136. Single Number
// Link: https://leetcode.com/problems/single-number/
// Language: Java
// Date: 4 Nov 2025
// Topic: Arrays

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // if this element appears only once, return it
            if (count == 1) {
                return nums[i];
            }
        }

        return -1; // default return
    }
}
