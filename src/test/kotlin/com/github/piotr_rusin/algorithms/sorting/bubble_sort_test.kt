package com.github.piotr_rusin.algorithms.sorting

class BasicBubbleSortTest: SortTest(::sortWithBubbleSort)

class OptimizedBubbleSortTest: SortTest(::sortWithOptimizedBubbleSort)

class EvenMoreOptimizedBubbleSortTest: SortTest(::sortWithEvenMoreOptimizedBubbleSort)