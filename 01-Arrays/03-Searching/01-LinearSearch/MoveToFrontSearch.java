package Array.ArraySearching.LinearSearch;

public class MoveToFrontSearch {
    public static void main(String[] args){
        int[] numbers = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};

        moveToFrontSearch(numbers,7);
        moveToFrontSearch(numbers,7);
    }

    static void moveToFrontSearch(int[] arr, int value){

        /*
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        int result = -1;
        int length = arr.length;
        for(int i=0; i<length; i++){
            if(arr[i] == value){
                result = i;
                if(i != 0){
                    int temp = arr[0];
                    arr[0] = arr[result];
                    arr[result] = temp;
                }
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
