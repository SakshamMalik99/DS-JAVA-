class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = dummy;
        for (int i = 0; i < m - 1; i++) {
            ptr = ptr.next;
        }
        ListNode prev = ptr;
        ListNode tail = ptr.next;
        int count = n - m;
        while (count-- > 0) {
            ListNode temp = prev.next;
            prev.next = tail.next;
            tail.next = tail.next.next;
            prev.next.next = temp;
        }
        return dummy.next;
    }
}