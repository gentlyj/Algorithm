package com.ifading.algorithm.sort;

/**
 * Created  on 20180408//.
 *
 * @author by yangjingsheng
 */
public class MergeSort {

    public static void sortArray(int[] arr) {
        sortArray(arr, 0, arr.length);
    }


    private static void sortArray(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;
        sortArray(arr, l, mid);
        sortArray(arr, mid + 1, r);
        merge(arr, l, mid + 1, r);
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int currentValue = arr[l];
        for (int i = ++l; i < r; i++) {
            if (arr[mid] < currentValue){

            }
        }
    }
}
