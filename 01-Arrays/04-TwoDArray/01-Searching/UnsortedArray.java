package Array.TwoDArray.Searching;

import java.util.Scanner;

public class UnsortedArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] numbers = {
                {54,33434,544,24,87,2},
                {90,0,9,49,4,22},
                {32,66,1,6,8,3},
                {99876,6543,567,432,987654,25446},
                {11,22,44,69,101,77}
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
         * Time Complexity: O(n*m)
         * Space Complexity: O(1)
         *
         * n = number of rows
         * m = number of columns
         */

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }

        return new int[] {-1,-1};
    }
}
