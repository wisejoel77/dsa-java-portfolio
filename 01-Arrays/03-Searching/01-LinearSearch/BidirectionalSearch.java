package Array.ArraySearching.LinearSearch;

public class BidirectionalSearch {
    public static void main(String[] args){
        int[] numbers = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};

        bidirectionalSearch(numbers,7);
        bidirectionalSearch(numbers,6);
        bidirectionalSearch(numbers,0);
        bidirectionalSearch(numbers,69);
    }

    static void bidirectionalSearch(int[] arr, int value){

        /*
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        boolean result = false;

        for(int left = 0, right = arr.length-1; left <= right; left++, right--){
            if(arr[left] == value || arr[right] == value){
                result = true;
                break;
            }
        }

        if(result){
            System.out.println(value + " is found");
        } else {
            System.out.println(value + " does not exist in the array");
        }
    }
}
