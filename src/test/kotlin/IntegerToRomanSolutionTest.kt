import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class IntegerToRomanSolutionTest {
    @ParameterizedTest
    @MethodSource("testData")
    fun `given an integer, convert it to a roman numeral`(num: Int, expected: String) {
        assertEquals(expected, IntegerToRomanSolution.intToRoman(num))
    }

    companion object {
        @JvmStatic
        fun testData() = listOf(
            Arguments.of(1, "I"),
            Arguments.of(2, "II"),
            Arguments.of(3, "III"),
            Arguments.of(4, "IV"),
            Arguments.of(8, "VIII"),
            Arguments.of(9, "IX"),
            Arguments.of(12, "XII"),
            Arguments.of(58, "LVIII"),
            Arguments.of(843, "DCCCXLIII"),
            Arguments.of(1994, "MCMXCIV"),
        )
    }
}