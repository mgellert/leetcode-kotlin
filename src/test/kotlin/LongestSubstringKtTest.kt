import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class LongestSubstringKtTest {
    @ParameterizedTest
    @MethodSource("testData")
    fun `find the length of the longest substring`(s: String, expected: Int) {
        val actual = lengthOfLongestSubstring(s)
        assertEquals(expected, actual)
    }


    companion object {
        @JvmStatic
        fun testData() = listOf(
            Arguments.of("abcabcbb", 3),
            Arguments.of("bbbbb", 1),
            Arguments.of("pwwkew", 3),
            Arguments.of("dvdf", 3),
        )
    }
}