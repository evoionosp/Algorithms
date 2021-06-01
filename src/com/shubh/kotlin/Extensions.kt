package com.shubh.kotlin;


    fun <T> Array<T>.print() {
        println(this.contentToString())
    }

fun <T> Array<T>.swap(a: Int, b: Int) {
    this[b] = this[a].also { this[a] = this[b] }
}

