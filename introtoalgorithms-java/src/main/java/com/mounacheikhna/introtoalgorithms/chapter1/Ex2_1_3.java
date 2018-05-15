package com.mounacheikhna.introtoalgorithms.chapter1;


public class Ex2_1_3 {

    public static void main(String[] args) {
        int[] arr = {5, 4, 11, 2, 19, 6, 23};
        System.out.println(Ex2_1_3.linearSearch(arr, 2));
    }

    /**
     * Invariant: no index k < i so that A[k] = v.
     * - Before the loop: i = 0 so there's no index k < i that A[k] = v trivially as there's no index.
     * - Maintenance: In order to precede to the next iteration of the loop, we need that for the current value of i,
     * we do not have A[i] = v.
     * - Termination: If the loop is exited after the if, then we have just placed an acceptable value in i
     * on the previous line. If the loop is exited by exhausting all possible values of i,
     * then we know that there is no index that has value i, and so null is correct.
     */
    private static Integer linearSearch(int[] arr, int v) {
        // invariant the sub array [0..i] does not contain v
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                return i;
            }
        }
        return null;
    }

}
