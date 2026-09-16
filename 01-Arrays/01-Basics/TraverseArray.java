package Array.ArrayBasics;

public class TraverseArray {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * n = number of elements in the array
     */

    public static void main(String[] args){

        int[] numbers = {1,2,3,4,5,6,7,8,9,0};

        // Using traditional for loop
        System.out.println("Using traditional for loop:");
        for(int i=0; i<numbers.length; i++){
            System.out.printf("Index %d: %d%n", i, numbers[i]);
        }
        System.out.println();

        // Using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for(int number: numbers){
            System.out.print(number + " ");
        }
    }
}
