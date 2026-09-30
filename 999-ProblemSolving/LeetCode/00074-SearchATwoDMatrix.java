/*
 * LeetCode #74 - Search a 2D Matrix
 *
 * Approach: Binary Search (Two-Stage)
 * Solved on: September 30, 2026
 * Time Complexity: O(log m + log n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLow = 0;
        int rowHigh = matrix.length - 1;

        while(rowLow <= rowHigh){
            int rowMid = rowLow + (rowHigh - rowLow) / 2;
            if(target >= matrix[rowMid][0] && target <= matrix[rowMid][matrix[rowMid].length - 1]){
                int low = 0;
                int high = matrix[rowMid].length - 1;

                while(low <= high){
                    int mid = low + (high - low) / 2;
                    if(matrix[rowMid][mid] == target){
                        return true;
                    } else if(target < matrix[rowMid][mid]){
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }

                return false;
            } else if(target < matrix[rowMid][0]){
                rowHigh = rowMid - 1;
            } else {
                rowLow = rowMid + 1;
            }
        }

        return false;
    }
}
