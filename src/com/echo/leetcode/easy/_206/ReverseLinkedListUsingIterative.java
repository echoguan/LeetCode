package com.echo.leetcode.easy._206;

/**
 * Reverse Linked List using iterative
 *
 * - Time complexity: O(n)
 * - Space complexity: 1
 *
 * @author echo.guan
 */
public class ReverseLinkedListUsingIterative {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;

        while (head != null) {
            ListNode nextTemp = head.next;
            head.next = pre;
            pre = head;
            head = nextTemp;
        }
        return pre;
    }
}
