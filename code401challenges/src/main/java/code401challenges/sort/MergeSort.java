package code401challenges.sort;

public class MergeSort {

    // https://www.baeldung.com/java-merge-sort
    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int middleOfArray = array.length / 2;
        int[] leftHalf = new int[middleOfArray];
        int[] rightHalf = new int[array.length - middleOfArray];
        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = array[middleOfArray + i];
        }
        return merge(mergeSort(leftHalf), mergeSort(rightHalf));
    }

    public static int[] merge(int[] leftHalf, int[] rightHalf) {
        int[] merged = new int[leftHalf.length + rightHalf.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                merged[k] = leftHalf[i];
                k++;
                i++;
            } else {
                merged[k] = rightHalf[j];
                k++;
                j++;
            }
        }
        while (i < leftHalf.length) {
            merged[k] = leftHalf[i];
            k++;
            i++;
        }
        while (j < rightHalf.length) {
            merged[k] = rightHalf[j];
            k++;
            j++;
        }
        return merged;
    }
}
