package com.github.piotr_rusin.algorithms.sorting

import com.github.piotr_rusin.algorithms.common.swap

fun <T: Comparable<T>> sortWithBubbleSort(values: Array<T>) {
    for (pass in 0..(values.size - 1)) {
        (1..(values.size - 1))
                .filter { values[it - 1] > values[it] }
                .forEach { swap(values, it - 1, it) }
    }
}