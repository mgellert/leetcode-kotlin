import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource


internal class TwoSumTest {

    @ParameterizedTest
    @MethodSource("testData")
    fun `find indices in nums that sum up to target`(nums: IntArray, target: Int, expected: IntArray) {
        assertArrayEquals(expected, twoSum(nums, target))
    }

    companion object {
        @JvmStatic
        fun testData() = listOf(
            Arguments.of(intArrayOf(2, 7, 11, 15), 9, intArrayOf(0, 1)),
            Arguments.of(intArrayOf(3, 2, 4), 6, intArrayOf(1, 2)),
            Arguments.of(intArrayOf(3, 3), 6, intArrayOf(0, 1)),
        )
    }
}