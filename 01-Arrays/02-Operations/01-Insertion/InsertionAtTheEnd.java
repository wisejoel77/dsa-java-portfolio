package Array.ArrayOperations.Insertion;

import java.util.Arrays;

public class InsertionAtTheEnd {
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

        // Inserting 77 at the end
        insertAtTheEnd(array, 77, getSize(array));
        System.out.println("After Insertion: " + Arrays.toString(array));
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

    static void insertAtTheEnd(int[] array, int element, int size){

        /*
         * Time Complexity: O(1)
         * Space Complexity: O(1)
         */

        if(size == array.length){
            System.out.println("Cannot insert the element");
        } else {
            array[size] = element;
        }
    }
}
