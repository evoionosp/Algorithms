package com.shubh.java;

import java.lang.reflect.Array;

  class ArrUtils {

      static void swap(int[] arr, int i, int j) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    static void print(int[] arr) {
        int i = 0;
        StringBuffer sb = new StringBuffer("[");
        while (i < arr.length){
          sb.append(arr[i]);
          if(i < arr.length - 1) sb.append(",");
          else sb.append("]");
          i++;
        }

        System.out.println(sb);
    }
}
