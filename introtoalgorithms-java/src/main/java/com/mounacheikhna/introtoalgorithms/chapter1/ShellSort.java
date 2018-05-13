package com.mounacheikhna.introtoalgorithms.chapter1;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 11, 2, 19, 6, 23, 12, 62, 7, 15};
        new ShellSort().shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void shellSort(int[] arr) {
        int[] gaps = { 701, 301, 132, 57, 23, 10, 4, 1 };
        int temp;
        int i, j;

        for (int gap : gaps) {
            for (i = gap; i < arr.length; i++) {
                temp = arr[i];
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }


    public void shellSort2(int[] arr) {
        int gap = arr.length / 2;
        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[i];
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
            if (gap == 2) {
                gap = 1;
            } else {
                gap *= (5.0 / 11);
            }
        }
    }


}
