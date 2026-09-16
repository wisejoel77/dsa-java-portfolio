/*
 * LeetCode #1480 - Running Sum of 1d Array
 * Solved on: January 07, 2026
 *
 * Approach: Prefix Sum
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
