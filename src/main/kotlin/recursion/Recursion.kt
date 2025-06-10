package org.matt.recursion

object Recursion {

    fun factorial(n: Int): Int {
        require(n >= 0) { "Negative values are not supported" }
        if (n == 0) return 1
        if (n == 1) return 1

        return n * factorial(n - 1)
    }

    fun power(n: Int, times: Int): Int {
        require(times >= 0) { "Negative values are not supported" }
        if (times == 0) return 1
        if (times == 1) return n

        return n * power(n, times - 1)
    }

    fun fibonacci(size: Int): List<Int> {
        require(size > 0) { "Only positive values are supported" }

        if (size == 1) return listOf(0)
        if (size == 2) return listOf(0, 1)

        val prev = fibonacci(size - 1)
        val next = prev[prev.size - 1] + prev[prev.size - 2]
        return prev + next
    }
}
