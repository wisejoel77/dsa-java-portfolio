/*
 * LeetCode #189 - Rotate Array
 * Solved on: September 22, 2026
 *
 * Approach: Auxiliary Array
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] arr = new int[length];
        k = k % length;

        for(int i=0; i<length; i++){
            arr[(i + k) % length] = nums[i];
        }

        for(int i=0; i<length; i++){
            nums[i] = arr[i];
        }
    }
}
