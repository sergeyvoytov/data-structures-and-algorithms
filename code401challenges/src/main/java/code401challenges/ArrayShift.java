package code401challenges;

import java.util.Arrays;

public class ArrayShift {

//    public static void main(String[] args) {
//
//
//
//    }

    public static int[] insertShiftArray(int[] arrayGiven, int newValue) {
//        arrayGiven = new Array[]{1, 2, 3, 4, 5};
//
//        int newValue = 100;

        int[] newArray = new int [arrayGiven.length +1];




        int index = arrayGiven.length / 2;
        for (int i = arrayGiven.length - 1; i > index; i--) {

            arrayGiven[i] = arrayGiven[i - 1];
        }
        arrayGiven[index] = newValue;
//        System.out.println("New Array: " + Arrays.toString(arrayGiven));

        return newArray;
    }


}
