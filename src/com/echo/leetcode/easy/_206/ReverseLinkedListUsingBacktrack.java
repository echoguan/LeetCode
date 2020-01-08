package com.echo.leetcode.easy._206;

public class ReverseLinkedListUsingBacktrack {
    public ListNode reverseList(ListNode head) {
        if (head.next == null || head == null) return head;

        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return p;
    }
}
