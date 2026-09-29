package Array.TwoDArray.Searching;

import java.util.Scanner;

public class SortedRowWise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] numbers = {
                {12, 47, 89, 134, 256, 389, 412, 578},
                {3, 28, 76, 145, 233, 367, 491, 620},
                {19, 54, 103, 178, 294, 355, 467, 731},
                {7, 63, 91, 156, 275, 340, 529, 684},
                {24, 38, 117, 209, 318, 402, 556, 799},
                {5, 42, 88, 171, 263, 377, 615, 845},
                {31, 69, 125, 194, 287, 433, 502, 918},
                {14, 57, 108, 183, 249, 396, 574, 867}
        };

        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
        int[] indices = search(numbers, target);
        if(indices[0] == -1){
            System.out.println(target + " is not found");
        } else {
            System.out.println(target + " is found at row " + (indices[0] + 1) + " column " + (indices[1] + 1));
        }

        scanner.close();
    }

    static int[] search(int[][] arr, int target){

        /*
         * Time Complexity: O(n * log(m))
         * Space Complexity: O(1)
         *
         * n = number of rows
         * m = number of columns
         */

        for(int row = 0; row < arr.length; row++){
            if(target >= arr[row][0] && target <= arr[row][arr[row].length - 1]){
                int low = 0;
                int high = arr[row].length - 1;

                while(low <= high){
                    int mid = low + (high - low) / 2;
                    if(arr[row][mid] == target){
                        return new int[] {row, mid};
                    } else if(target < arr[row][mid]){
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }

        return new int[] {-1,-1};
    }
}
