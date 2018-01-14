package com.github.piotr_rusin.algorithms.common

fun <T> swap(values: Array<T>, i: Int, j: Int) {
    val temp = values[j]
    values[j] = values[i]
    values[i] = temp
}
