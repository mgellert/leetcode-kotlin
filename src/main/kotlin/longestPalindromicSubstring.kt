class Solution {
    fun longestPalindrome(s: String): String {
        var longest = ""
        for (i in s.indices) {
            val oddPalindrome = expand(s, i, i)
            val evenPalindrome = expand(s, i, i + 1)
            val palindrome = if ((oddPalindrome?.length ?: 0) > (evenPalindrome?.length ?: 0))
                oddPalindrome else evenPalindrome
            if (palindrome != null && palindrome.length > longest.length) {
                longest = palindrome
            }
        }
        return longest
    }

    private fun expand(s: String, left: Int, right: Int): String? {
        return if (left < 0 || right >= s.length || s[left] != s[right]) {
            s.substring(left + 1, right)
        } else {
            expand(s, left - 1, right + 1)
        }
    }
}