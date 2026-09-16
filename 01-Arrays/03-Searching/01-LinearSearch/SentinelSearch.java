package Array.ArraySearching.LinearSearch;

public class SentinelSearch {
    public static void main(String[] args){
        int[] numbers = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};

        sentinelSearch(numbers,7);
        sentinelSearch(numbers,6);
        sentinelSearch(numbers,0);
        sentinelSearch(numbers,69);
    }

    static void sentinelSearch(int[] arr, int value){

        /*
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        int index = 0;
        int result;
        int end = arr[arr.length-1];
        arr[arr.length-1] = value;
        while(arr[index] != value){
            index++;
        }
        if(index < arr.length-1 || end == value){
            result = index+1;
        } else {
            result = -1;
        }
        arr[arr.length-1] = end;

        if(result ==  -1){
            System.out.println(value + " does not exist in the array");
        } else {
            System.out.println(value + " is found at position " + (result));
        }
    }
}
