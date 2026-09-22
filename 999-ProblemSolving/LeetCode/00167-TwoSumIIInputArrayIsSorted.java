/*
 * LeetCode #167 - Two Sum II - Input Array Is Sorted
 *
 * Approach 1: Two Pointers
 * Solved on: September 22, 2026
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0, j = numbers.length-1; i < j; ){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                return new int[] {i+1, j+1};
            } else if (sum < target){
                i++;
            } else {
                j--;
            }
        }
        return new int[] {0, 0};
    }
}
