/*
 * LeetCode #81 - Search in Rotated Sorted Array II
 *
 * Approach: Binary Search (Rotated Sorted Array with Duplicates)
 * Solved on: September 22, 2026
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return true;
            } else if (nums[low] == nums[mid] && nums[high] == nums[mid]) {
                low++;
                high--;
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
        return false;
    }
}
