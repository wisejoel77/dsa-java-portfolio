/*
 * LeetCode #2114 - Maximum Number of Words Found in Sentences
 * Solved on: January 08, 2026
 *
 * Approach: String Traversal
 * Time Complexity: O(n × m)
 * Space Complexity: O(1)
 */

 class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 1;
        for(int i=0; i<sentences.length; i++){
            int count = 1;
            for(int j=0; j<sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    count++;
                }
            }
            if(max<count){
            max = count;
            }
        }
        return max;
    }
}
