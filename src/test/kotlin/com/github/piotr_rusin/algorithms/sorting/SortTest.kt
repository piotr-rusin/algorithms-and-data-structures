package com.github.piotr_rusin.algorithms.sorting

import org.assertj.core.api.Assertions.*
import org.junit.Test

abstract class SortTest(private val testedFunction: (values: Array<Int>) -> Unit) {
    @Test
    fun sortsAnArray() {
        val toBeSorted = arrayOf(3, 8, 10, 2, 9, 13, 21, 7, 1, 0, 4)
        val expected = toBeSorted.sortedArray()

        testedFunction(toBeSorted)

        assertThat(toBeSorted).isEqualTo(expected)
    }
}