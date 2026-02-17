/**
 * BubbleSort - A program demonstrating the bubble sort algorithm
 * 
 * Bubble Sort is a simple sorting algorithm that repeatedly steps through
 * the list, compares adjacent elements and swaps them if they are in the
 * wrong order. The pass through the list is repeated until the list is sorted.
 * 
 * Time Complexity:
 * - Best Case: O(n) - when array is already sorted
 * - Average Case: O(n²)
 * - Worst Case: O(n²) - when array is reverse sorted
 * 
 * Space Complexity: O(1) - sorts in place
 */
public class BubbleSort {
    
    /**
     * Performs bubble sort on an integer array
     * 
     * Algorithm explanation:
     * 1. Start from the first element, compare it with the next element
     * 2. If the current element is greater than the next, swap them
     * 3. Move to the next pair and repeat until the end of array
     * 4. After each pass, the largest element "bubbles up" to its correct position
     * 5. Repeat the process for remaining unsorted elements
     * 
     * @param arr The array to be sorted
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop for each pass through the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop for comparing adjacent elements
            // After each pass, the last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if they are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no swaps were made, array is already sorted
            // This optimization reduces best case to O(n)
            if (!swapped) {
                break;
            }
            
            // Show progress after each pass
            System.out.println("After pass " + (i + 1) + ": " + arrayToString(arr));
        }
    }
    
    /**
     * Utility method to convert array to string for display
     * @param arr The array to convert
     * @return String representation of the array
     */
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    /**
     * Main method to demonstrate bubble sort
     */
    public static void main(String[] args) {
        // Example 1: Unsorted array
        System.out.println("=== Example 1: Unsorted Array ===");
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + arrayToString(arr1));
        System.out.println("\nSorting process:");
        bubbleSort(arr1);
        System.out.println("\nFinal sorted array: " + arrayToString(arr1));
        
        // Example 2: Already sorted array (best case)
        System.out.println("\n\n=== Example 2: Already Sorted Array ===");
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + arrayToString(arr2));
        System.out.println("\nSorting process:");
        bubbleSort(arr2);
        System.out.println("\nFinal sorted array: " + arrayToString(arr2));
        
        // Example 3: Reverse sorted array (worst case)
        System.out.println("\n\n=== Example 3: Reverse Sorted Array ===");
        int[] arr3 = {5, 4, 3, 2, 1};
        System.out.println("Original array: " + arrayToString(arr3));
        System.out.println("\nSorting process:");
        bubbleSort(arr3);
        System.out.println("\nFinal sorted array: " + arrayToString(arr3));
    }
}
