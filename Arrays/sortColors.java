// Link: https://leetcode.com/problems/sort-colors/
// Language: Java
// Problem: 75. Sort Colors
// Topic: Arrays / Two Pointers / Dutch National Flag Algorithm
// Date: 7 Nov 2025

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;                 // pointer for 0s
        int mid = 0;                 // pointer for 1s
        int high = nums.length - 1;  // pointer for 2s

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap 0 to the left
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // 1 is already in correct place
                mid++;
            } else {
                // swap 2 to the right
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
