object RomanToIntegerSolution {
    fun romanToInt(s: String, charsetStart: Int = 6, ordinal: Int = 1000): Int {
        if (ordinal == 0) {
            return 0
        }
        val charSet = chars.subList(charsetStart, charsetStart + 3)
        val roman = s.subSequence(0, s.length).takeWhile { c -> charSet.contains(c.toString()) }.toString()
        return convert(roman, charSet) * ordinal + romanToInt(s.substring(roman.length), charsetStart - 2, ordinal / 10)
    }

    private fun convert(s: String, charSet: List<String>): Int {
        return when (s) {
            "" -> 0
            charSet[0].repeat(1) -> 1
            charSet[0].repeat(2) -> 2
            charSet[0].repeat(3) -> 3
            charSet[0] + charSet[1] -> 4
            charSet[1] -> 5
            charSet[1] + charSet[0].repeat(1) -> 6
            charSet[1] + charSet[0].repeat(2) -> 7
            charSet[1] + charSet[0].repeat(3) -> 8
            charSet[0] + charSet[2] -> 9
            else -> throw IllegalArgumentException("Cannot convert $s to integer.")
        }
    }

    private val chars = listOf("I", "V", "X", "L", "C", "D", "M", "-", "-")
}
