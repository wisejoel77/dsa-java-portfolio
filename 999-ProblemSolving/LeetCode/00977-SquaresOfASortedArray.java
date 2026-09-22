/*
 * LeetCode #977 - Squares of a Sorted Array
 *
 * Approach: Two Pointers
 * Solved on: September 22, 2026
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] sortedSquares(int[] nums) {
        int position = nums.length - 1;
        int[] result = new int[position + 1];

        for(int left=0, right=nums.length-1; left<=right; ){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if(leftSquare < rightSquare){
                result[position--] = rightSquare;
                right--;
            } else {
                result[position--] = leftSquare;
                left++;
            }
        }

        return result;
    }
}
