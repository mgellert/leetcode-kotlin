fun lengthOfLongestSubstring(s: String): Int {
    var i = 0
    var longestSubstr = 0
    while (i < s.length) {
        var j = i
        val chars = mutableSetOf<Char>()
        while (j < s.length && !chars.contains(s[j])) {
            chars.add(s[j])
            j++
        }
        if (chars.size > longestSubstr) {
            longestSubstr = chars.size
        }
        i++
    }
    return longestSubstr
}