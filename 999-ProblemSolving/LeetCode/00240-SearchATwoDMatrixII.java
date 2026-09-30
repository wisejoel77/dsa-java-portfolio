/*
 * LeetCode #240 - Search a 2D Matrix II
 *
 * Approach: Staircase Search
 * Solved on: September 30, 2026
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row <= matrix.length-1 && col >= 0){
            if(matrix[row][col] == target){
                return true;
            } else if(target < matrix[row][col]){
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}
