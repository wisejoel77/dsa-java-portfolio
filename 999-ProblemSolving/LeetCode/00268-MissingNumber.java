/*
 * LeetCode #268 - Missing Number
 * Solved on: January 05, 2026
 *
 * Approach: Sorting
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int missingNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i==nums[i])
                count++;
            else {
                return i;
            }
        }
        return count;
    }
}
