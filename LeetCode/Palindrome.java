class Palindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode tail = findReverseTail(head);
        while (tail != null) {
            if (head.val != tail.val)
                return false;
            head = head.next;
            tail = tail.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    private ListNode findReverseTail(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        return reverse(slow);
    }
}