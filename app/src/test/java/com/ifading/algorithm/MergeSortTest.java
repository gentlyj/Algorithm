package com.ifading.algorithm;

import com.ifading.algorithm.sort.MergeSort;

import org.junit.Test;

/**
 * Created  on 20180409//.
 *
 * @author by yangjingsheng
 */
public class MergeSortTest {
    @Test
    public void testMergeSort(){
        int[] data = {3, 4, 1, 2,5};
        MergeSort.sortArray(data);
    }
}
