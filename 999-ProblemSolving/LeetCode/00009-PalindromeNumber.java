/*
 * LeetCode #9 - Palindrome Number
 * Solved on: August 27, 2026
 *
 * Approach: Number Reversal
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isPalindrome(int x) {
        if(Math.signum(x) == -1){
            return false;
        }
        int n = x;
        int reversedNumber = 0;
        while(n != 0){
            int digit = n % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            n = n / 10;
        }
        if(reversedNumber == x){
            return true;
        } else {
            return false;
        }
    }
}
