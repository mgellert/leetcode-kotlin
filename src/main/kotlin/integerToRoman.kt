object IntegerToRomanSolution {
    fun intToRoman(num: Int, ordinal: Int = 10000, charSet: Int = 6): String {
        if (ordinal == 1) {
            return ""
        }
        val chars = allChars.subList(charSet, charSet + 3)
        return convert((num % ordinal) / (ordinal / 10), chars) + intToRoman(num, ordinal / 10, charSet - 2)
    }

    private fun convert(num: Int, charSet: List<String>): String {
        return when (num) {
            0 -> ""
            in 1..3 -> charSet[0].repeat(num)
            4 -> charSet[0] + charSet[1]
            in 5..8 -> charSet[0].repeat(num).replaceFirst(charSet[0].repeat(5), charSet[1])
            9 -> charSet[0] + charSet[2]
            else -> throw IllegalArgumentException("Cannot convert $num to roman number.")
        }
    }

    private val allChars = listOf("I", "V", "X", "L", "C", "D", "M", "", "")
}
