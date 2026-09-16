/*
 * LeetCode #283 - Move Zeroes
 * Solved on: January 06, 2026
 *
 * Approach: Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        Arrays.toString(nums);
    }
}
