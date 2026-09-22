/*
 * Floor and Ceil in Sorted Array
 * Solved on: September 22, 2026
 *
 * Approach: Binary Search (Floor and Ceil)
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      return new int[] {getFloor(a, n, x), getCeil(a, n, x)};
    }
    
    static int getFloor(int[] arr, int length, int target){
      int low = 0;
      int high = length - 1;
      int floor = -1;

      while(low <= high){
        int mid = low + (high - low) / 2;
        if(arr[mid] <= target){
          floor = arr[mid];
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }

      return floor;
    }

    static int getCeil(int[] arr, int length, int target){
      int low = 0;
      int high = length - 1;
      int ceil = -1;

      while(low <= high){
        int mid = low + (high - low) / 2;
        if(arr[mid] >= target){
          ceil = arr[mid];
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      }

      return ceil;
    }
}

/*
 * Problem Statement: https://www.naukri.com/code360/problems/ceiling-in-a-sorted-array_1825401
 */
