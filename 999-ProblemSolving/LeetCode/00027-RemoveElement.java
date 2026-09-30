/*
 * LeetCode #27 - Remove Element
 *
 * Approach: Two Pointers
 * Solved on: September 30, 2026
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;

        for( ; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
