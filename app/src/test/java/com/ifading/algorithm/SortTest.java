package com.ifading.algorithm;

import com.ifading.algorithm.sort.FastSort;

import org.junit.Test;


/**
 * Created  on 20180409//.
 *
 * @author by yangjingsheng
 */
public class SortTest {

    @Test
    public void testMergeSort(){
        int[] ints = TestDataGenerater.generateRandomArrays(0, 100, 100);
        //MergeSort.sortArray(ints);
        FastSort.sortArray(ints);
    }
}
