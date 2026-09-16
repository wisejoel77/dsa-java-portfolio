package Array.ArrayOperations.Deletion;

import java.util.Arrays;

public class DeletionAtThePosition {
    public static void main(String[] args) {

        /*
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;

        // Deleting element at the position 5
        deleteAtThePosition(array, getSize(array), 5);
        System.out.println("After Deletion: " + Arrays.toString(array));
    }

    static int getSize(int[] array){

        /*
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        int count = 0;
        for(int number: array){
            if(number == 0){
                return count;
            } else {
                count++;
            }
        }
        return count;
    }

    static void deleteAtThePosition(int[] array, int size, int position){

        /*
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        for(int i=position-1; i<size-1; i++){
            array[i] = array[i+1];
        }
        array[size-1] = 0;
    }
}
