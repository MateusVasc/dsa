package recursion

import org.matt.recursion.factorial
import org.matt.recursion.fibonacci
import org.matt.recursion.power
import kotlin.test.Test
import kotlin.test.assertFailsWith

class Recursion {

    @Test
    fun `factorial should return the factorial of successfully`() {
        // Given
        val mockFactorial = 5040
        val mockN = 7

        // When
        val factorial = factorial(mockN)

        // Then
        assert(factorial == mockFactorial)
    }

    @Test
    fun `factorial should return one when calculating factorial of zero`() {
        // Given
        val mockFactorial = 1
        val mockN = 0

        // When
        val factorial = factorial(mockN)

        // Then
        assert(factorial == mockFactorial)
    }

    @Test
    fun `factorial should throw illegal argument exception for factorial of a negative number`() {
        // Given
        val mockN = -21
        val mockEMessage = "Negative values are not supported"

        // Then When
        val e = assertFailsWith<IllegalArgumentException> { factorial(mockN) }
        assert(e.message == mockEMessage)
    }

    @Test
    fun `power should return the power of successfully`() {
        // Given
        val mockPower = 2401
        val mockTimes = 4
        val mockN = 7

        // When
        val power = power(mockN, mockTimes)

        // Then
        assert(power == mockPower)
    }

    @Test
    fun `power should return one when times zero`() {
        // Given
        val mockPower = 1
        val mockTimes = 0
        val mockN = 7

        // When
        val power = power(mockN, mockTimes)

        // Then
        assert(power == mockPower)
    }

    @Test
    fun `power should throw illegal argument exception when times negative`() {
        // Given
        val mockEMessage = "Negative values are not supported"
        val mockTimes = -9
        val mockN = 7

        // Then When
        val e = assertFailsWith<IllegalArgumentException> { power(mockN, mockTimes) }
        assert(e.message == mockEMessage)
    }

    @Test
    fun `fibonacci should return the sequence successfully`() {
        // Given
        val mockFibArr = mutableListOf(0, 1, 1, 2, 3)
        val mockSize = 5

        // When
        val fib = fibonacci(mockSize)

        // Then
        assert(fib == mockFibArr)
    }

    @Test
    fun `fibonacci should throw illegal argument exception when size smaller then one`() {
        // Given
        val mockEMessage = "Only positive values are supported"
        val mockSize = 0

        // Then When
        val e = assertFailsWith<IllegalArgumentException> { fibonacci(mockSize) }
        assert(e.message == mockEMessage)
    }
}