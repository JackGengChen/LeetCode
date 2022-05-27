package com.cg.ita.chapter2.insertionSort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort2 {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int key = arr[i];
            /** 将arr[j-1] > key改成arr[j-1] < key 顺序会倒一倒 **/
            while (j > 0 && arr[j-1] > key) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,3,2,1,2,4,5,6,7,8,9,3,5,6,9};
        new InsertionSort2().sort(a);
        System.out.println(Arrays.toString(a));
    }
}
