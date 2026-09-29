package Array.TwoDArray.Searching;

import java.util.Scanner;

public class SortedMatrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] numbers = {
                {  3,  17,  29,  45,  61,  78,  94, 112},
                {121, 135, 147, 158, 171, 184, 198, 214},
                {225, 243, 256, 273, 287, 299, 318, 340},
                {351, 367, 389, 402, 417, 433, 449, 467},
                {478, 491, 502, 519, 536, 551, 574, 590},
                {603, 615, 629, 645, 661, 684, 701, 719},
                {731, 748, 762, 779, 795, 812, 834, 851},
                {867, 883, 901, 918, 934, 952, 971, 990}
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
         * Time Complexity: O(log(n) + log(m))
         * Space Complexity: O(1)
         *
         * n = number of rows
         * m = number of columns
         */

        int rowLow = 0;
        int rowHigh = arr.length-1;

        while(rowLow <= rowHigh){
            int rowMid = rowLow + (rowHigh - rowLow) / 2;
            if(target >= arr[rowMid][0] && target <= arr[rowMid][arr[rowMid].length - 1]){
                int low = 0;
                int high = arr[rowMid].length - 1;
                while(low <= high){
                    int mid = low + (high - low) / 2;
                    if(arr[rowMid][mid] == target){
                        return new int[] {rowMid, mid};
                    } else if (arr[rowMid][mid] < target){
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                return new int[] {-1, -1};
            } else if (arr[rowMid][0] < target){
                rowLow = rowMid + 1;
            } else {
                rowHigh = rowMid - 1;
            }
        }

        return new int[] {-1,-1};
    }
}
