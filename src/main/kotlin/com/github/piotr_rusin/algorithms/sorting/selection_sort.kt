package com.github.piotr_rusin.algorithms.sorting

import com.github.piotr_rusin.algorithms.common.swap

/**
 * Selection sort works by selecting the next last element of the sorted
 * range from elements still present in the unsorted range.
 */
fun <T: Comparable<T>> sortWithSelection(values: Array<T>) {
    for (destinationIndex in 0..(values.size - 1)) {
        var minUnsortedElementIndex = destinationIndex

        ((destinationIndex + 1)..(values.size - 1))
                .asSequence()
                .filter { values[it] < values[minUnsortedElementIndex] }
                .forEach {
                    minUnsortedElementIndex = it // new minimum
                }

        if (minUnsortedElementIndex != destinationIndex) {
            swap(values, destinationIndex, minUnsortedElementIndex)
        }

    }
}
