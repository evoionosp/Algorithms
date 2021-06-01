package com.shubh.kotlin;

class QuickSort(arr: Array<Int>, low: Int = 0, high: Int = arr.size-1) {

    init {
        if(low < high) {
            var pivot = partition(arr, low, high)
            println("$pivot")
            QuickSort(arr, low, pivot)
            QuickSort(arr, pivot+1, high)
            arr.print()
        } else {
            arr.print()
        }
    }

    private fun partition(arr: Array<Int>, low: Int, high: Int) : Int {


        var pivot = arr[low]


        var i = low;
        var j = high;

        while(i < j) {

            do {
                i++;
            } while (arr[i] <= pivot)

            do {
                j--;
            } while (arr[j] > pivot)

            if(i < j)
                arr.swap(i, j)

        }
        arr.swap(low,j)
        return j;
    }
}

