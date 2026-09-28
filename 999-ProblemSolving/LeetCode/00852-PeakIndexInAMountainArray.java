/*
 * LeetCode #852 - Peak Index in a Mountain Array
 *
 * Approach 1: Binary Search
 * Solved on: September 28, 2026
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > arr[mid + 1]){
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }
}
