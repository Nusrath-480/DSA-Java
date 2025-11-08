// Link: https://leetcode.com/problems/find-the-duplicate-number/
// Problem: 287. Find the Duplicate Number
// Language: Java
// Topic: Arrays, Frequency Count
// Date: 8 Nov 2025

class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] count = new int[n]; // frequency array

        for (int i = 0; i < n; i++) {
            count[nums[i]]++; // increase the count for nums[i]
            if (count[nums[i]] > 1) {
                return nums[i]; // found the duplicate
            }
        }

        return -1; // no duplicate found (theoretically shouldn't happen)
    }
}
