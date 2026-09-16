/*
 * LeetCode #1929 - Concatenation of Array
 * Solved on: January 06, 2026
 *
 * Approach: Array Construction
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
