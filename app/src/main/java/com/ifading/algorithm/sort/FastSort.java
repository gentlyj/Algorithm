package com.ifading.algorithm.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created  on 20180409//.
 *
 * @author by yangjingsheng
 */
public class FastSort {
    private static Random random = new Random();

    public static void sortArray(int[] arr) {

        fastSortArray(arr, 0, arr.length - 1);
        System.out.println("arr:" + Arrays.toString(arr));
    }

    private static void fastSortArray(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int p = partition(arr, left,right);
        fastSortArray(arr, left, p - 1);
        fastSortArray(arr, p + 1, right);

    }

    /**
     * 把整个数组调整为小于某个值的元素都放在 innerSeed的左边,大于的都放右边,完成排序
     *
     * @param arr        待排序数组
     * @param left       左闭
     * @param right      右闭
     */
    private static int partition(int[] arr, int left, int right) {
        int innnerSeed = random.nextInt(right - left) + left + 1;
        swap(arr, left, innnerSeed);
        int j = left;
        for (int i = left + 1; i <= right; i++) {
            if (arr[i] < arr[left]) {
                swap(arr, j + 1, i);
                j++;
            }
        }

        swap(arr, left, j);

        return j;

    }

    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
