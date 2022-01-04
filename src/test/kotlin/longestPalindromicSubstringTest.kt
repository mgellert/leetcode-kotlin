import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class LongestPalindromicSubstringTest {
    @ParameterizedTest
    @MethodSource("testData")
    fun `given a string s, return the longest palindromic substring in s`(s: String, expected: String) {
        assertEquals(expected, Solution().longestPalindrome(s))
    }

    companion object {
        @JvmStatic
        fun testData() = listOf(
            Arguments.of("babad", "bab"),
            Arguments.of("cbbd", "bb"),
            Arguments.of("h1hh3hasdfdsah", "hasdfdsah"),
        )
    }
}