package Array.ArrayBasics;

public class CreateArray {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * n = number of elements in the array.
     */

    public static void main(String[] args){

        int[] array; // Declaration of an int array
        array = new int[5]; // Instantiation of an array of size 5 with default integer values

        // Assigning values
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        // Printing array values
        for(int number: array){
            System.out.print(number + " ");
        }
    }
}
