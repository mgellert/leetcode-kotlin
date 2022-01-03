class ListNode(var `val`: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        return "ListNode(`val`=$`val`)"
    }
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var sum: ListNode? = null
    var l1 = l1
    var l2 = l2
    var head: ListNode? = null
    var carry = 0

    while (l1?.`val` != null || l2?.`val` != null) {
        val a = l1?.`val` ?: 0
        val b = l2?.`val` ?: 0

        val li = ListNode((a + b + carry) % 10)
        carry = (a + b + carry) / 10
        if (sum == null) {
            head = li
        } else {
            sum.next = li
        }
        sum = li
        l1 = l1?.next
        l2 = l2?.next
    }

    if (carry > 0) {
        sum?.next = ListNode(carry)
    }

    return head
}
