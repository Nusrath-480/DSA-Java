// Link: https://leetcode.com/problems/powx-n/
// Language: Java
// Problem: 50. Pow(x, n)
// Topic: Math / Recursion
// Date: 4 Nov 2025

class Solution {
    public double myPow(double x, int n) {
        long power = n; // convert to long to avoid overflow
        double result = 1.0;

        // if power is negative, invert x
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        // fast exponentiation
        while (power > 0) {
            if ((power % 2) == 1) { // if odd power
                result *= x;
            }
            x *= x;
            power /= 2;
        }

        return result;
    }
}
