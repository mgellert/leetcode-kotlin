import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class RomanToIntegerSolutionTest {
    @ParameterizedTest
    @MethodSource("testData")
    fun `given a roman numeral, convert it to an integer`(s: String, expected: Int) {
        assertEquals(expected, RomanToIntegerSolution.romanToInt(s))
    }

    companion object {
        @JvmStatic
        fun testData() = listOf(
            Arguments.of("M", 1000),
            Arguments.of("MD", 1500),
            Arguments.of("MDXL", 1540),
            Arguments.of("III", 3),
            Arguments.of("LVIII", 58),
            Arguments.of("MCMXCIV", 1994),
        )
    }
}