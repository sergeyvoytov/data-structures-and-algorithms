package code401challenges;

import java.util.Arrays;

public class ArrayShift {


    public static int[] insertShiftArray(int[] arrayGiven, int newValue) {
//        arrayGiven = new Array[]{1, 2, 3, 4, 5};
//
//        int newValue = 100;

        int[] newArray = new int[arrayGiven.length + 1];
        int index = findCentr(arrayGiven);


        for (int i = 0; i < arrayGiven.length + 1; i++) {

            if (i < index) {
                newArray[i] = arrayGiven[i];
            } else if (i == index) {
                newArray[i] = newValue;
            } else {
                newArray[i] = arrayGiven[i - 1];
            }
        }
        return newArray;
    }


    public static int findCentr(int[] FindCentr) {
        if (FindCentr.length % 2 != 0) {
            return FindCentr.length / 2 + 1;
        } else {
            return FindCentr.length / 2;
        }
    }

}
