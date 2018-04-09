package com.ifading.algorithm;

import com.ifading.algorithm.sort.FastSort;
import com.ifading.algorithm.sort.InsertionSort;

import org.junit.Test;


/**
 * Created  on 20180409//.
 *
 * @author by yangjingsheng
 */
public class SortTest {

    @Test
    public void testMergeSort(){
        int[] arr = TestDataGenerater.generateRandomArrays(0, 100, 5);
        //MergeSort.sortArray(arr);
        //FastSort.sortArray(arr);
        InsertionSort.sortArray(arr);
    }
}
