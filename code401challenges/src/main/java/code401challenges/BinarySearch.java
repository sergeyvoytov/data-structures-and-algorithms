package code401challenges;

public class BinarySearch {

    public BinarySearch(int[] array, int value) {
    }

    public static int binarySearch(int array[], int value) {
        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            int midPoint = (first + last) / 2;

            if (array[midPoint] == value) {
                return midPoint;
            }
            if (array[midPoint] < value) {
                first = midPoint + 1;
            }
            if (array[midPoint] > value) {
                last = midPoint - 1;
            }
        }
        return -1;
    }
}





