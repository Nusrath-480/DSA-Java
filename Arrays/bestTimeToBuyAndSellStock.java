// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Language: Java
// Problem: 121. Best Time to Buy and Sell Stock
// Topic: Arrays
// Date: 4 Nov 2025

class Solution {
    public int maxProfit(int[] prices) {
        // Minimum price so far (start with a large number)
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            // found cheaper stock, update buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // calculate profit if we sell today
                int profit = prices[i] - minPrice;

                // check if it’s the best profit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
