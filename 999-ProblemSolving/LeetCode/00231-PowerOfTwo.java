/*
 * LeetCode #231 - Power of Two
 * Solved on: August 27, 2026
 *
 * Approach: Iterative Powers of Two
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        long powerOfTwo = 0;
        for(int i=0; powerOfTwo <= n; i++){
            if((powerOfTwo = (long) Math.pow(2,i)) == n){
                return true;
            }
        }
        return false;
    }
}
