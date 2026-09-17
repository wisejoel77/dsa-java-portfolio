/*
 * LeetCode #35 - Search Insert Position
 * Solved on: September 17, 2026
 *
 * Approach: Binary Search (Lower Bound)
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        return lowerBound(nums, target);
    }

    static int lowerBound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
