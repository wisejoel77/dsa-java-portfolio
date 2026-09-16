package Array.ArraySearching.BinarySearch;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.print("Enter number to search: ");
        int key = scanner.nextInt();

        System.out.printf("Upper bound of %d is %d",key, upperBound(numbers, key));

        scanner.close();
    }

    static int upperBound(int[] arr,int key){

        /*
         * Time Complexity: O(log n)
         * Space Complexity: O(1)
         */

        int low = 0;
        int high = arr.length-1;

        if(key > arr[high]){
            return arr.length;
        } else {
            while(low <= high){
                int mid = low + (high - low) / 2;
                if(arr[mid] > key){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }
    }
}
