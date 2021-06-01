package com.shubh.java;

import java.util.Arrays;

public class MergeSort implements SortingAlgo{

    @Override
    public int[] sort(int[] input) {
        mergeSort(input);
        System.out.println( Arrays.toString(input));
        return input;
    }

    void mergeSort(int[] arr) {
        int n = arr.length;
        if(n == 1) return;

        int nL = n/2;
        int nR = n - nL;
        int[] left = new int[nL];
        int[] right = new int[nR];

        int i = 0,k = 0;
        while( i < nL) {
            left[i++] = arr[k++];
        }
        i = 0;
        while( i < nR) {
            right[i++] = arr[k++];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

   private void merge(int[] arr, int[] left, int[] right) {
        int nL = left.length;
        int nR = right.length;

        int i = 0,j = 0, k = 0;

        while (i < nL && j < nR) {
            if(left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < nL){
            arr[k++] = left[i++];
        }

        while (j < nR){
            arr[k++] = right[j++];
        }
   }
}
