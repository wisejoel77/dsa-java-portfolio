/*
 * LeetCode #34 - Find First and Last Position of Element in Sorted Array
 * Solved on: September 17, 2026
 *
 * Approach: Binary Search (Lower Bound and Upper Bound)
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {firstPosition(nums, target), lastPosition(nums, target)};
    }

    static int firstPosition(int[] arr, int target){
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

        if(low == arr.length || arr[low] != target){
            return -1;
        }
        return low;
    }

    static int lastPosition(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if(low != 0){
            low--;
        }

        if(arr.length == 0 || arr[low] != target){
            return -1;
        } else {
            return low;
        }
    }
}
