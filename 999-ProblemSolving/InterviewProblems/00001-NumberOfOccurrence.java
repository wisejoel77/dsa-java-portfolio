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
        int firstOccurrence = firstOccurrence(arr, n, x);
        if(firstOccurrence == -1){
            return 0;
        } else {
            int lastOccurrence = lastOccurrence(arr, n, x);
            return lastOccurrence - firstOccurrence + 1;
        }
    }

    static int firstOccurrence(int[] arr, int n, int target){
        int low = 0;
        int high = n-1;
        int firstOccurrence = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                firstOccurrence = mid;
                high = mid - 1;
            } else if (arr[mid] > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return firstOccurrence;
    }

    static int lastOccurrence(int[] arr, int n, int target){
        int low = 0;
        int high = n-1;
        int lastOccurrence = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                lastOccurrence = mid;
                low = mid + 1;
            } else if (arr[mid] > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return lastOccurrence;
    }
}

/*
 * Problem Statement: https://www.naukri.com/code360/problems/occurrence-of-x-in-a-sorted-array_630456
 */
