package Array.ArraySearching.LinearSearch;

public class LinearSearch {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public static void main(String[] args){
        int[] numbers = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};

        linearSearch(numbers,5);
        linearSearch(numbers,433);
    }

    static void linearSearch(int[] arr, int value){

        /*
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        int result = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                result = i;
                break;
            }
        }

        if(result ==  -1){
            System.out.println(value + " does not exist in the array");
        } else {
            System.out.println(value + " is found at position " + (result+1));
        }
    }
}
