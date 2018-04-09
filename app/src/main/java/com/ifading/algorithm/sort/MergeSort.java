package com.ifading.algorithm.sort;


import java.util.Arrays;

/**
 * Created  on 20180408//.
 *
 * @author by yangjingsheng
 */
public class MergeSort {

    public static void sortArray(int[] arr) {
        int[] temp = new int[arr.length];
        sortArray(arr, 0, arr.length - 1, temp);
        System.out.println("arr:" + Arrays.toString(arr));
    }


    private static void sortArray(int[] arr, int l, int r, int[] temp) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        sortArray(arr, l, mid, temp);
        sortArray(arr, mid + 1, r, temp);
        merge(arr, l, mid, r, temp);
    }


    /**
     * 分治,把两个有序的数组合并为一个有序的数组
     *
     * @param arr  待排序数组
     * @param l    左闭 index
     * @param mid  中间 index,视为两个数组的分界,第一数组为[l, mid],第二个数组为[mid+1,r]
     * @param r    右闭 idnex
     * @param temp 临时数组,用来放置排序好的数组
     */
    private static void merge(int[] arr, int l, int mid, int r, int[] temp) {
        int i = l;
        int j = mid + 1;
        int t = 0;

        //分别取左右两数组当前的最小值,比较进行取值,直到某一边的数组遍历完成
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }

        //取完左边可能剩余的值
        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        //取完右边可能剩余的值
        while (j <= r) {
            temp[t++] = arr[j++];
        }

        //把排好序的值赋给原数组
        t = 0;
        while (l <= r) {
            arr[l++] = temp[t++];
        }
    }

}
