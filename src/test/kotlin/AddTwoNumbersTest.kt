import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class AddTwoNumbersTest {
    @ParameterizedTest
    @MethodSource("testData")
    fun `add two numbers represented as linked lists`(l1: IntArray, l2: IntArray, expected: IntArray) {
        val actual = addTwoNumbers(l1.toListNode(), l2.toListNode())?.toIntArray()
        assertArrayEquals(expected, actual)
    }


    companion object {
        @JvmStatic
        fun testData() = listOf(
            Arguments.of(intArrayOf(1, 1, 1), intArrayOf(2, 2, 2), intArrayOf(3, 3, 3)),
            Arguments.of(intArrayOf(2, 4, 3), intArrayOf(5, 6, 4), intArrayOf(7, 0, 8)),
            Arguments.of(intArrayOf(0), intArrayOf(0), intArrayOf(0)),
            Arguments.of(intArrayOf(9, 9, 9, 9, 9, 9, 9), intArrayOf(9, 9, 9, 9), intArrayOf(8, 9, 9, 9, 0, 0, 0, 1)),
        )
    }
}

private fun IntArray.toListNode(): ListNode {
    var li: ListNode? = null
    this.reversed().forEach { i ->
        val current = ListNode(i)
        current.next = li
        li = current
    }
    return li!!
}

private fun ListNode.toIntArray(): IntArray {
    var head: ListNode? = this
    val arr = mutableListOf<Int>()

    while (head != null) {
        arr.add(head.`val`)
        head = head.next
    }

    return arr.toIntArray()
}