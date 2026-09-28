/*
 * LeetCode #2951 - Find the Peaks
 *
 * Approach: Linear Traversal
 * Solved on: September 28, 2026
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();

        int i = 1;
        int length = mountain.length - 1;
        while(i < length){
            if(mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]){
                peaks.add(i);
            }
            i++;
        }

        return peaks;
    }
}
