import java.util.Arrays;

/**
 * Java implementation of the bubble sort algorithm
 */
public class bubbleSort {

    /**
     * Returns an array of integers in ascending order that has been sorted using the bubble sort algorithm. 
     * The array is traversed while comparing adjacent elements, moving larger elements to the right (hence the bubbling).
     * This sorting implementation utilizes a boolean variable "swapped" which tracks whether any swaps have occurred
     * as the array is traversed. If no swaps have occurred during a traversal, 
     * the array is necessarily sorted and the sorting loop will break.
     * @param arr the array to be sorted
     */
    public static void bubbleSort(int[] arr) {
        // Outer loop to iterate through the array
        for (int n = arr.length - 1; n > 0; n--) {

            // Initialize swapped to track if any swaps occur
            boolean swapped = false;

            // Inner loop to compare adjacent elements
            for (int i = 0; i < n; i++) {
                if (arr[i] > arr[i + 1]) {

                    // Swap elements if they are in the wrong order
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    // Mark that a swap has occurred
                    swapped = true;
                }
            }

            // If no swaps occurred, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Test method to demonstrate bubble sort algorithm
     *
     * @param args sample array built into main method to prove out concept
     */
    public static void main(String[] args) {
        int[] arr = {2, 45, 37, 21, 31, 50, 29, 22, 67, 88, 56};

        System.out.println("Unsorted array is:");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}
