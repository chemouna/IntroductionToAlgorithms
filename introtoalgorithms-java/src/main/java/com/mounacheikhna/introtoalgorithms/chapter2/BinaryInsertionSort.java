package com.mounacheikhna.introtoalgorithms.chapter2;

public class BinaryInsertionSort {

    public static void binaryInsertionSort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            // binary search to determine index j at which to insert a[i]
            Comparable v = a[i];
            int lo = 0, hi = i;
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                if (less(v, a[mid])) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }

            // insertion sort with "half exchanges"
            // (insert a[i] at index j and shift a[j], ..., a[i-1] to right)
            for (int j = i; j > lo; --j) {
                a[j] = a[j - 1];
            }
            // or System.arraycopy(a, lo, a, lo + 1, i - lo); (instead of the for loop)
            a[lo] = v;
        }
    }

    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void show(Comparable[] a) {
        for (Comparable v : a) {
            System.out.print(v + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 9, 5, 12, 1, 33, 21, 8, 14, 7};
        BinaryInsertionSort.binaryInsertionSort(arr);
        show(arr);
    }
}
