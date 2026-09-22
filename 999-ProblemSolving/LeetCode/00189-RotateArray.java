/*
 * LeetCode #189 - Rotate Array
 *
 * Approach 1: Array Reversal
 * Solved on: September 22, 2026
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach 2: Auxiliary Array
 * Solved on: September 22, 2026
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

// Approach 1
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length);
        reverse(nums, 0, k);
        reverse(nums, k, nums.length);
    }

    static void reverse(int[] arr, int low, int high){
        high--;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}

// Approach 2
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
