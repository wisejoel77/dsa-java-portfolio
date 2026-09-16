/*
 * LeetCode #7 - Reverse Integer
 * Solved on: August 27, 2026
 *
 * Approach: Number Reversal
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x == Integer.MIN_VALUE){
            return 0;
        }
        if(Math.signum(x) == -1){
            isNegative = true;
            x = -x;
        }
        long reversedNumber = 0;
        while(x != 0){
            int digit = x % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            x = x / 10;
        }
        if(isNegative){
            reversedNumber = -reversedNumber;
            if(reversedNumber < Integer.MIN_VALUE){
                return 0;
            } else {
                return (int) reversedNumber;
            }
        }
        if(reversedNumber > Integer.MAX_VALUE){
            return 0;
        } else {
            return (int) reversedNumber;
        }
    }
}
