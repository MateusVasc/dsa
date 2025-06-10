package org.matt.recursion

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

