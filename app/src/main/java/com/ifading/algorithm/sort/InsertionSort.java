package com.ifading.algorithm.sort;

import java.util.Arrays;

/**
 * Created  on 20180409//.
 *
 * @author by yangjingsheng
 */
public class InsertionSort {
    public static void sortArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i; j > 0 && temp < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }


}
