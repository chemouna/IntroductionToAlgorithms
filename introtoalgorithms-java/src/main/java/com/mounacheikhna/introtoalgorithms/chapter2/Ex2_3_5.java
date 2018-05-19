package com.mounacheikhna.introtoalgorithms.chapter2;

public class Ex2_3_5 {

    public static void main(String[] args) {
        int[] arr = {12, 2, 7, 3, 21, 5};
        System.out.println(Ex2_3_5.binarySearch(arr, 7));
    }

    static int binarySearch(int[] arr, int v) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (arr[mid] > v) {
                high = mid - 1;
            } else if (arr[mid] < v) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -(low + 1); // not found
    }
}
