package Array.TwoDArray.Searching;

import java.util.Scanner;

public class SortedRowWiseAndColumnWise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] numbers = {
                {  3,  17,  29,  45,  61,  78,  94, 112, 135, 158},
                { 12,  24,  38,  52,  69,  85, 103, 121, 147, 171},
                { 21,  31,  47,  64,  82,  99, 117, 138, 159, 184},
                { 34,  43,  58,  76,  93, 111, 129, 151, 176, 198},
                { 49,  55,  71,  89, 106, 124, 143, 165, 189, 214},
                { 63,  68,  84, 101, 119, 137, 156, 179, 203, 227},
                { 77,  81,  98, 116, 133, 152, 171, 194, 219, 243},
                { 91,  96, 113, 130, 148, 167, 186, 210, 235, 258},
                {108, 115, 131, 149, 166, 185, 205, 228, 252, 277},
                {124, 132, 149, 167, 184, 204, 225, 248, 273, 299}
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
         * Time Complexity: O(n + m)
         * Space Complexity: O(1)
         *
         * n = number of rows
         * m = number of columns
         */

        int row = 0;
        int col = arr[0].length - 1;

        while(row <= arr.length-1 && col >= 0){
            if(arr[row][col] == target){
                return new int[] {row, col};
            } else if(target < arr[row][col]){
                col--;
            } else{
                row++;
            }
        }

        return new int[] {-1,-1};
    }
}
