/*
 * LeetCode #33 - Search in Rotated Sorted Array
 *
 * Approach: Binary Search (Rotated Sorted Array)
 * Solved on: September 22, 2026
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[low] <= nums[mid]){
                if(target <= nums[mid] && target >= nums[low]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if(target <= nums[high] && target >= nums[mid]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
