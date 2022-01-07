import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class ContainerWithMostWaterSolutionTest {
    @ParameterizedTest
    @MethodSource("testData")
    fun `find two lines that together with the x-axis form a container, find the largest container`(
        heights: IntArray,
        expected: Int
    ) {
        assertEquals(expected, ContainerWithMostWaterSolution.maxArea(heights))
    }

    companion object {
        @JvmStatic
        fun testData() = listOf(
            Arguments.of(intArrayOf(1, 1), 1),
            Arguments.of(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7), 49),
            Arguments.of(intArrayOf(1, 0, 0, 0, 0, 0, 7, 8, 0, 0, 0, 1), 11),
            Arguments.of(intArrayOf(1, 0, 0, 0, 0, 0, 17, 18, 0, 0, 0, 1), 17),
        )
    }
}