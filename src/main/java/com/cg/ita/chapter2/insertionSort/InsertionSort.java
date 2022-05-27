package com.cg.ita.chapter2.insertionSort;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j-1] < arr[j]) {
                    break;
                }
                int tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,3,2,1,2,4,5,6,7,8,9,3,5,6};
        new InsertionSort().sort(a);
        System.out.println(Arrays.toString(a));
    }
}
