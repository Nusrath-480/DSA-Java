// Link: https://leetcode.com/problems/product-of-array-except-self/
// Problem: 238. Product of Array Except Self
// Language: Java
// Topic: Arrays, Prefix & Suffix Product
// Date: 8 Nov 2025

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Step 1: Initialize result with 1s
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }
        
        // Step 2: Compute prefix (left) products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        
        // Step 3: Compute suffix (right) products and multiply
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return result;
    }
}
