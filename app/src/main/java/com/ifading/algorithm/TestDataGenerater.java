package com.ifading.algorithm;

import java.util.Random;

/**
 * Created  on 20180409//.
 *
 * @author by yangjingsheng
 */
public class TestDataGenerater {
    private static Random random = new Random();

    public static int[] generateRandomArrays(int left, int right, int length){
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(right -left -1)+left;
        }
        return arr;
    }
}
