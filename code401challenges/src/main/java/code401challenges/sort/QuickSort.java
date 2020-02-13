package code401challenges.sort;
// https://www.baeldung.com/java-quicksort

public class QuickSort {

    public static int[] quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    // Helper function with recursion on 2 pieces of array
    static void quickSort(int arr[], int left, int right) {
        // Checks to see if there is anything left to sort
        if (left < right) {
            // index of the pivot
            int position = partition(arr, left, right);
            // sort left
            quickSort(arr, left, position - 1);
            //sort right
            quickSort(arr, position + 1, right);
        }
    }

    static int partition(int array[], int left, int right) {
        // set a pivot value as a point of reference
        int pivot = array[right];
        // create a variable to track the largest index of numbers lower than the defined pivot
        int low = (left - 1);
        // Loops through array and swaps values that are less than pivot with values that are greater than pivot
        for (int i = left; i < right; i++) {
            if (array[i] <= pivot) {
                low++;
                swap(array, low, i);
            }
        }
        swap(array, low + 1, right);
        return low + 1; // Returns the index of pivot
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
