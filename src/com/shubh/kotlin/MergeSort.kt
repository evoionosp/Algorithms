package com.shubh.kotlin;

class MergeSort(arr: Array<Int>, l: Int = 0, r: Int = arr.size-1) {

    init {
        if(l < r) {
            var m = l + (r-l)/2
            MergeSort(arr, l , m)
            MergeSort(arr, m+1 , r)
            merge(arr,l,m,r)
        }
        arr.print()
    }

    private fun merge(arr: Array<Int>, l: Int, m: Int, r: Int) : Int {
        var n1: Int = m-l+1
        var n2: Int = r-m

        var left = Array<Int>(n1){0};
        var right = Array<Int>(n2){0};

        left.forEachIndexed { index, _ ->
            left[index] = arr[index]
        }

        right.forEachIndexed { index, _ ->
            right[index] = arr[index+m]
        }

        var i = 0;
        var j = 0;
        var k = 0;

        while(i < n1 && j < n2) {
            if(left[i] < right[j]) {
                arr[k++] = left[i++]
            } else {
                arr[k++] = right[j++]
            }
        }

        while (i < n1) {
            arr[k++] = left[i++]
        }

        while (j < n2) {
            arr[k++] = right[j++]
        }


        return 0;
    }

}

