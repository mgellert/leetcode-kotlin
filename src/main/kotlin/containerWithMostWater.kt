import kotlin.math.abs
import kotlin.math.min

object ContainerWithMostWaterSolution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var largestVolume = 0

        while (left != right) {
            val volume = min(height[left], height[right]) * abs(left - right)
            if (volume > largestVolume) {
                largestVolume = volume
            }
            if (height[left] > height[right]) {
                right--
            } else {
                left++
            }
        }
        return largestVolume
    }
}