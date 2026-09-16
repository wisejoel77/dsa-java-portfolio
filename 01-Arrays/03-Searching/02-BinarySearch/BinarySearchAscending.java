package Array.ArraySearching.BinarySearch;

import java.util.Scanner;

public class BinarySearchAscending {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.print("Enter number to search: ");
        int key = scanner.nextInt();

        binarySearch(numbers, key);

        scanner.close();
    }

    static void binarySearch(int[] arr, int key){

        /*
         * Time Complexity: O(log n)
         * Space Complexity: O(1)
         */

        int low = 0;
        int high = arr.length-1;
        int index = -1;

        while(low <= high){
            int mid = low + ((high-low) / 2);
            if(arr[mid] == key){
                index = mid;
                break;
            } else if (key < arr[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if(index == -1){
            System.out.println(key + " is not available in the array");
        } else {
            System.out.println(key + " is found at position " + (index + 1));
        }
    }
}
