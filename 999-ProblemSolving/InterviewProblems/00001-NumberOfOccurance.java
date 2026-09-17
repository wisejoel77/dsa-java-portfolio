/*
 * Number of Occurrences
 * Solved on: September 17, 2026
 *
 * Approach: Binary Search (First and Last Occurrence)
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class Solution {
    public static int count(int arr[], int n, int x) {
        int firstOccurance = firstOccurance(arr, n, x);
        if(firstOccurance == -1){
            return 0;
        } else {
            int lastOccurance = lastOccurance(arr, n, x);
            return lastOccurance - firstOccurance + 1;
        }
    }

    static int firstOccurance(int[] arr, int n, int target){
        int low = 0;
        int high = n-1;
        int firstOccurance = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                firstOccurance = mid;
                high = mid - 1;
            } else if (arr[mid] > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return firstOccurance;
    }

    static int lastOccurance(int[] arr, int n, int target){
        int low = 0;
        int high = n-1;
        int lastOccurance = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                lastOccurance = mid;
                low = mid + 1;
            } else if (arr[mid] > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return lastOccurance;
    }
}

/*
 * Problem Statement: https://www.naukri.com/code360/problems/occurrence-of-x-in-a-sorted-array_630456
 */
