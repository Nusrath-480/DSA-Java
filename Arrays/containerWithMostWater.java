// Link: https://leetcode.com/problems/container-with-most-water/
// Language: Java
// Problem: 11. Container With Most Water
// Topic: Arrays / Two Pointers
// Date: 7 Nov 2025

class Solution {
    public int maxArea(int[] height) {
        int left = 0;                      // left pointer
        int right = height.length - 1;     // right pointer
        int maxArea = 0;                   // maximum water area found so far

        while (left < right) {
            int width = right - left;                          // distance between lines
            int minHeight = Math.min(height[left], height[right]);  // limiting height
            int area = width * minHeight;                      // calculate area
            maxArea = Math.max(maxArea, area);                 // update max area

            // move the pointer at the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
