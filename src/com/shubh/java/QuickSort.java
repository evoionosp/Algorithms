package com.shubh.java;

import java.util.Arrays;

public class QuickSort implements SortingAlgo {

    @Override
    public int[] sort(int[] input) {

        int[] a =  Arrays.copyOf(input, input.length+1);

        a[a.length - 1] = Integer.MAX_VALUE;


       return performQuickSort(a, 0, a.length-1);
    }

    private int[] performQuickSort(int[] arr, int l, int h) {
        if(l < h) {
            int pivote = partition(arr, l, h);
            performQuickSort(arr, l, pivote);
            performQuickSort(arr, pivote + 1, h);
        }


       return Arrays.copyOf(arr, arr.length-1);
    }


    private int partition(int[] arr, int l, int h) {
        int pi = arr[l];
        int i = l;
        int j = h;

        while (i <= j) {
            do {
                i++;
            } while (arr[i] < pi);

            do {
                j--;
            } while (arr[j] > pi);

            if(i < j) {
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;


            }
        }
        arr[l] = arr[j];
        arr[j] = pi;

        return j;
    }
}
