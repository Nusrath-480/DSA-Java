// Link: https://leetcode.com/problems/3sum/
// Problem: 15. 3Sum
// Language: Java
// Topic: Array, Two Pointers, Sorting
// Date: 9 Nov 2025
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Step 1: sort array
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Step 2: Skip duplicate elements for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;                 // Step 3: start of remaining part
            int right = nums.length - 1;      // Step 3: end of array

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; // Step 4: total sum of 3 numbers

                if (sum == 0) {                // Step 5: perfect triplet found
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Step 6: skip same elements to avoid duplicate triplets
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // Step 7: move both pointers inward
                    left++;
                    right--;
                } else if (sum < 0) {          // Step 8: need a bigger sum
                    left++;                    // move left to higher value
                } else {                       // Step 9: need a smaller sum
                    right--;                   // move right to smaller value
                }
            }
        }
        return result;                         // Step 10: return final list
    }
}
