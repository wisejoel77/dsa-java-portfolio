/*
 * LeetCode #258 - Add Digits
 * Solved on: August 27, 2026
 *
 * Approach: Repeated Digit Sum
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int addDigits(int num) {
        int sum = num;
        while(sum > 9){
            int internalSum = 0;
            while(num != 0){
                internalSum += num % 10;
                num = num / 10;
            }
            num = internalSum;
            sum = internalSum;
        }
        return sum;
    }
}
