package com.github.piotr_rusin.algorithms.sorting

import com.github.piotr_rusin.algorithms.common.swap

fun <T: Comparable<T>> sortWithBubbleSort(values: Array<T>) {
    for (pass in 0..(values.size - 1)) {
        (1..(values.size - 1))
                .filter { values[it - 1] > values[it] }
                .forEach { swap(values, it - 1, it) }
    }
}

/**
 * After n-th pass (starting from 1), n last elements are in expected order, so
 * we don't have to swap them.
 */
fun <T: Comparable<T>> sortWithOptimizedBubbleSort(values: Array<T>) {
    var swapped = true
    var elementsToCheck = values.size
    while (swapped) {
        swapped = false
        for (j in 1..(elementsToCheck - 1)) {
            if (values[j-1] > values[j]) {
                swap(values, j - 1, j)
                swapped = true
            }
        }
        elementsToCheck--
    }
}