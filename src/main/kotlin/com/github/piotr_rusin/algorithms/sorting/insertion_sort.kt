package com.github.piotr_rusin.algorithms.sorting

import com.github.piotr_rusin.algorithms.common.swap

/**
 * A version that repeatedly swaps the next element to be sorted with its preceding element in
 * sorted part of the array, until the element is put in its proper position.
 */
fun <T: Comparable<T>> sortByInsertionWithSwap(values: Array<T>){
    for (nextUnsortedIndex in 1..(values.size - 1)) {
        var currentIndex = nextUnsortedIndex
        while (currentIndex > 0 && values[currentIndex] < values[currentIndex - 1]) {
            swap(values, currentIndex, currentIndex - 1)
            currentIndex--
        }
    }
}
