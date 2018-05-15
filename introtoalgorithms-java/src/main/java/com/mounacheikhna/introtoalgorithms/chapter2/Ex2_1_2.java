package com.mounacheikhna.introtoalgorithms.chapter2;

import java.util.Arrays;

public class Ex2_1_2 {

    public static void main(String[] args) {
        int[] arr = {5, 4, 11, 2, 19, 6, 23};
        Ex2_1_2.insertSortDec(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSortDec(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
    }

}
