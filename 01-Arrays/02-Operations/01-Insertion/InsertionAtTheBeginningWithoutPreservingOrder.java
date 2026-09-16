package Array.ArrayOperations.Insertion;

import java.util.Arrays;

public class InsertionAtTheBeginningWithoutPreservingOrder {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;

        // Inserting 77 at the beginning without preserving the order
        insertWithOutOrder(array, 77, getSize(array));
        System.out.println("Inserting without preserving order: " + Arrays.toString(array));
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

    // Insertion at the beginning without preserving the order

    /*
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */

    static void insertWithOutOrder(int[] array, int element, int size){
        if(size == array.length){
            System.out.println("Cannot insert the element");
        } else {
            array[size] = array[0];
            array[0] = element;
        }
    }
}
