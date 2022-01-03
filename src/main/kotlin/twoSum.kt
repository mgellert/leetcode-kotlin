fun twoSum(nums: IntArray, target: Int): IntArray {
    val diffs = nums.mapIndexed { index, i ->
        target - i to index
    }.toMap()
    nums.forEachIndexed { index, i ->
        if (diffs.containsKey(i)) {
            val other = diffs[i]!!
            if (other != index) {
                return intArrayOf(index, other)
            }
        }
    }
    return intArrayOf(-1, -1)
}
